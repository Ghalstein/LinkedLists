public class ListPivot {

	public static void pivot(ListNode<Integer> list, int n) {
		ListNode<Integer> curr = list;
		ListNode<Integer> pivot = ListNode.find(list, n);

		while (curr != null) {
			
		}
	}

	public static void main(String[] args) {
		// unit testing inserting after a node
		ListNode<Integer> node = new ListNode<>();
		node.data = -1;
		ListNode<Integer> list = ListNode.randGen(10);
		ListNode.insertAfter(list.next, node);
		System.out.println(list);
	}
}