public class CyclicShift {

	// counts to the number n and then makes that node the end and the one infront of it the start
	public static ListNode<Integer> shift(ListNode<Integer> list, int n) {
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
		list = newHead;
		curr = newHead;
		// finding the old end of the list to connect it to the old head of the list
		while (curr.next != null) {
			curr = curr.next;
		}
		// setting the old end of the list to the old head of the list
		curr.next = head;
		return list;
	}

	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(5);
		System.out.println("Before: " + list);
		System.out.println("After: " + shift(list, 3));
	}
}