public class ListPivot {

	public static void pivot(ListNode<Integer> list, int n) {
		ListNode<Integer> curr = list;
		ListNode<Integer> pivot = ListNode.find(list, n);
		ListNode<Integer> newList = new ListNode<>();\
		newList.data = pivot.data;

		while (curr.next != null) {
			ListNode<Integer> prev = curr;
			curr = curr.next;
			if (curr.data < pivot.data) {
				ListNode.insertBefore(pivot, prev);
			}
			else if (curr.data > pivot.data) {
				ListNode.insertAfter(pivot, prev);
			}
		}
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
		pivot(testList, 4);
		System.out.println("After" + testList);

	}
}