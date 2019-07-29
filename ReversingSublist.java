public class ReversingSublist {

	// from the specified node reverses every node after
	private static void reverseSublist(ListNode<Integer> beforeStart, int interval) {
		ListNode<Integer> prev = beforeStart.next;
		ListNode<Integer> curr = prev.next;
		ListNode<Integer> forward = curr.next;
		
		//iterating through the sublist
		for (int i = 0; i < interval; ++i) {
			curr.next = prev;
			prev = curr;
			curr = forward;
			if (curr == null) {
				break;
			}
			forward = forward.next;
		}
		ListNode<Integer> temp = beforeStart.next;
		temp.next = curr;
		beforeStart.next = prev;
		// System.out.println(curr);
		// System.out.println(prev);
		// System.out.println(forward);
		// changes the outer pointers
	}

	public static void reverse(ListNode<Integer> list, int start, int stop) {
		if (start == stop) {
			return;
		}
		reverseSublist(ListNode.find(list, start - 1), (stop - start));
	}
	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(10);
		System.out.println("Start: " + list);
		reverse(list, Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("Last: " + list);
	}
}