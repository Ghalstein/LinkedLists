public class CyclicShift {

	// counts to the number n and then makes that node the end and the one infront of it the start
	public static void shift(ListNode<Integer> list, int n) {
		ListNode<Integer> head = list;
		ListNode<Integer> curr = list;
		// keeps track of how deep in the list 
		int count = 0;
		while (curr != null && ++count < n) {
			curr = curr.next;
		}
		// foudn the new head of the list
		ListNode<Integer> newHead = curr.next;
		// setting the curr node to the end of the list 
		curr.next = null;
		// finding the old end of the list to connect it to the old head of the list
		while (newHead.next != null) {
			newHead = newHead.next;
		}
		// setting the old end of the list to the old head of the list
		newHead.next = head;
	}

	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(5);
		System.out.println("Before: " + list);
		shift(list, 3);
		System.out.println("After: " + list);
	}
}