public class ListPivot {

	public static ListNode<Integer> pivot(ListNode<Integer> list, int n) {
		ListNode<Integer> pivot = ListNode.find(list, n);
		System.out.println("Pivot: " + pivot.data);
		ListNode<Integer> newPivot = new ListNode<>();
		ListNode<Integer> curr = list;
		newPivot.data = pivot.data;
		ListNode<Integer> frontBack = new ListNode<>();
		ListNode<Integer> realFront = new ListNode<>();
		ListNode<Integer> back = frontBack;
		ListNode<Integer> front = realFront;
		ListNode<Integer> frontTail = new ListNode<>();

		while (curr != null) {
			if (curr.data <= pivot.data && curr != pivot) {
				ListNode<Integer> target = new ListNode<>();
				target.data = curr.data;
				curr = curr.next;
				front.next = target;
				front = front.next;
				frontTail = target;
			}
			else if (curr.data > pivot.data) {
				ListNode<Integer> target = new ListNode<>();
				target.data = curr.data;
				curr = curr.next;
				back.next = target;
				back = back.next;
			}
			else {
				curr = curr.next;
			}
		}

		frontTail.next = newPivot;
		newPivot.next = frontBack.next;
		back.next = null;
		realFront = realFront.next;
		return realFront;
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
		System.out.println("After" + pivot(testList, 4));

	}
}