/*
Attemp to only delete a middle node
Not meant for first nodes, but will add exception
*/

public class DeleteMiddleNode {


	public static int delete(ListNode<Integer> list, int num) {
		ListNode<Integer> curr = list.next;
		ListNode<Integer> prev = list;
		int count = 2;
		if (count > num) {
			return -1;
		}

		if ()
		while (curr != null) {
			if (count == num) {
				int data = curr.data;
				prev.next = curr.next;
				return data;
			}
			else {
				++count;
				prev = prev.next;
				curr = curr.next;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ListNode<Integer> list1 = ListNode.randGen(5);
		ListNode<Integer> list2 = ListNode.randGen(5);
		System.out.println("before list1: " + list1);
		System.out.println("before list2: " + list2);
		System.out.println(delete(list1, 4));
		System.out.println(delete(list2, 5));
		System.out.println("after list1: " + list1);
		System.out.println("after list2: " + list2);
	}
}