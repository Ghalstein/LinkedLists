/*
Find the kth to last element of a singly linekd list without a tail
*/


public class KthToLast {

	public static int find(ListNode<Integer> list, int num) {
		// set curr as head of list
		ListNode<Integer> curr = list;
		int count = 0;
		while (curr != null) {
			++count;
			curr = curr.next;
		}	

		// checking for params logic

		if (count < num) {
			return -1;
		}

		// reset curr
		curr = list;
		int i = 0;
		while (i < count - num) {
			curr = curr.next;
			++i;
		}
		return curr.data;
	}

	public static int optimalFind(ListNode<Integer> list, int num) {
		ListNode<Integer> curr = list;
		ListNode<Integer> prev = list;
		int count = 0;

		while (curr != null) {
			++count;
			curr = curr.next;
			if (count > num) {
				prev = prev.next;
			}
		}
		return prev.data;
	}

	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(5);
		System.out.println("list: " + list);
		System.out.println("2nd to last: " + find(list, 2));
		System.out.println("2nd to last using optimal: " + optimalFind(list, 2));
	}
}