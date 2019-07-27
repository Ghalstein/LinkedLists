public class MergeSortedLinkedLists {


	// random Sorted listNode generator
	public static ListNode randomSortedListGen(int n, int init) {
		ListNode<Integer> list = new ListNode<>();
		ListNode curr = list;
		int j = init;
		for (int i = 0; i < n; ++i) {
			if (i < n -1) {
				int rand = j + 1 + (int)(Math.random() * 10); 
				curr.data = rand;
				curr.next = new listNode();
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
	}
}