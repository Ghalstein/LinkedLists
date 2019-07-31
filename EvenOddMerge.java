public class EvenOddMerge {

	public static ListNode<Integer> merge(ListNode<Integer> list) {
		ListNode<Integer> oddHead = list.next;
		ListNode<Integer> oddCurr = list.next;
		ListNode<Integer> head = list;
		ListNode<Integer> evenCurr = list;

		// making sure not at the end of the list for an even or odd case
		while (oddCurr != null && evenCurr != null) {
			if (oddCurr.next != null && evenCurr.next != null) {
				evenCurr.next = evenCurr.next.next;
				oddCurr.next = oddCurr.next.next;
				evenCurr = evenCurr.next;
				oddCurr = oddCurr.next;
			}
		}
		// links the even and odd lists together
		evenCurr.next = oddHead;
		return head;
	}

	public static void main(String[] args) {
		ListNode <Integer> list = ListNode.randGen(10);
		System.out.println("Before: " + list);
		System.out.println("After: " + merge(list));
	}
}