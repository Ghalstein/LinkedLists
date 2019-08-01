public class ListPivot {

	public static ListNode<Integer> pivot(ListNode<Integer> list, int n) {
		ListNode<Integer> pivot = ListNode.find(list, n);
		System.out.println("Pivot: " + pivot.data);
		ListNode<Integer> newPivot = new ListNode<>();
		ListNode<Integer> curr = list;
		newPivot.data = pivot.data;
		ListNode<Integer> back = new ListNode<>();
		ListNode<Integer> front = new ListNode<>();
		ListNode<Integer> frontTail = new ListNode<>();

		while (curr != null) {
			if (curr.data <= pivot.data && curr != pivot) {
				ListNode<Integer> target = curr;
				curr = curr.next;
				front.next = target;

			}
			else if (curr.data > pivot.data) {
				ListNode<Integer> target = curr;
				curr = curr.next;
				back.next = target;
				frontTail = target;
			}
		}

		frontTail.next = newPivot;
		pivot.next = back.next;
		back.next = null;
		return front;
	}
	
	public static void main(String[] args) {
		// unit testing inserting after a node
		ListNode<Integer> node = new ListNode<>();
		node.data = -1;
		ListNode<Integer> list = ListNode.randGen(10);
		ListNode.insertBefore(list.next, node);
		System.out.println(list);

		ListNode<Integer> testList = ListNode.randGen(10);
		System.out.println("Before" + testList);
		System.out.println(pivot(testList, 4));
		// System.out.println("After" + testList);

	}
}