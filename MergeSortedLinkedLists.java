public class MergeSortedLinkedLists {

	// random Sorted listNode generator
	private static ListNode randomSortedListGen(int n, int init) {
		ListNode<Integer> list = new ListNode<>();
		ListNode<Integer> curr = list;
		int j = init;
		for (int i = 0; i < n; ++i) {
			if (i < n -1) {
				int rand = j + 1 + (int)(Math.random() * 10); 
				curr.data = rand;
				curr.next = new ListNode<>();
				curr = curr.next;
				j = rand;
			}
			else {
				int rand = j + 1 + (int)(Math.random() * 10); 
				curr.data = rand;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ListNode list1 = randomSortedListGen(5, 3);
		ListNode list2 = randomSortedListGen(5, 5);
		System.out.println("list1: " + list1.toString());
		System.out.println("list2: " + list2.toString());
	}
}