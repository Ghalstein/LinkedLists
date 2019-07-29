public class ReversingSublist {

	// from the specified node reverses every node after
	private static void reverseSublist(ListNode<Integer> beforeStart, int interval) {
		ListNode<Integer> prev = beforeStart.next;
		ListNode<Integer> curr = prev.next;
		ListNode<Integer> forward = curr.next;

		System.out.println(curr);
		System.out.println(prev);
		System.out.println(forward);
		
		//iterating through the sublist
		for (int i = 0; i < interval; ++i) {
			curr.next = prev;
			curr = forward;
			prev = curr;
			forward = forward.next;
		}
		// changes the outer pointers
		beforeStart.next.next = forward;
		beforeStart.next = curr;
	}

	public static void reverse(ListNode<Integer> list, int start, int stop) {
		reverseSublist(ListNode.search(list, start), (stop - start));
	}
	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(5);
		System.out.println("Start: " + list);
		reverse(list, 2, 4);
		System.out.println("Last: " + list);
	}
}