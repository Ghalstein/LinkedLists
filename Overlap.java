public class Overlap {

	public static boolean isOverlap(ListNode<Integer> l1, ListNode<Integer> l2) {


		while ((l1.next != null || l2.next != null) && l1 != l2) {
			// testing for each list if next is null and incrementing if not
			if (l1.next != null) {
				l1 = l1.next;
			}

			if (l2.next != null) {
				l2 = l2.next;
			}
		}

		if (l2 == l1) {
			return true;
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		ListNode<Integer> l1 = ListNode.randGen(5);
		ListNode<Integer> l2 = ListNode.randGen(10);
		System.out.println(isOverlap(l1, l2));
	}
}