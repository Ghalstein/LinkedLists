public class RemoveKthFromLast {

	private static ListNode<Integer> find(ListNode<Integer> list, int k) {
		ListNode<Integer> curr = list;
		int count = 0;
		ListNode<Integer> kth = list;

		while (curr.next != null) {
			if (++count > k + 1) {
				kth = kth.next;
			}
			curr = curr.next;
		}
		return kth;
	}

	public static void delete(ListNode<Integer> list, int k) {
		ListNode<Integer> prevKth = find(list, k);
		prevKth.next = prevKth.next.next;
	}

	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(5);
		System.out.println("Before: " + list);
		delete(list, 2);
		System.out.println("After: " + list);
	}
}