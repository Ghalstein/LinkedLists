public class MergeSortedLinkedLists {

	// random Sorted listNode generator
	private static ListNode<Integer> randomSortedListGen(int n, int init) {
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

	public static ListNode<Integer> mergeSortedLists(ListNode<Integer> list1, ListNode<Integer> list2) {
		// pointers for the two lists
		ListNode<Integer> curr1 = list1;
		ListNode<Integer> curr2 = list2;

		// empty list we will add to as we traverse through both lists
		ListNode<Integer> list = new ListNode<>();
		ListNode<Integer> curr = list;

		while (curr1 != null || curr2 != null) {		
			if (curr1 != null && curr2 != null) {
				if (curr2.comapreTo(curr1)) {
					curr.data = curr1.data;
					// making a new node on the multi list and moving curr to it
					curr.next = new ListNode<Integer>();
					curr = curr.next;

					// moved on to the next node for this lsit
					curr1 = curr1.next;
				}
				else {
					curr.data = curr2.data;

					// making a new node on the multi list and moving curr to it
					curr.next = new ListNode<Integer>();
					curr = curr.next;

					// moved on to the next node for this lsit
					curr2 = curr2.next;
				}
			}
			// if curr1 is the remaining list to add from
			else if (curr1 != null) {
				curr.data = curr1.data;
				curr1 = curr1.next;
				while (curr1 != null) {
					curr.next = new ListNode<>();
					curr = curr.next;
					curr.data = curr1.data;
					curr1 = curr1.next;
				}
			}
			// if curr2 is the remaining list to add from
			else {
				curr.data = curr2.data;
				curr2 = curr2.next;
				while (curr2 != null) {
					curr.next = new ListNode<>();
					curr = curr.next;
					curr.data = curr2.data;
					curr2 = curr2.next;
				}
			}
		}
		return list; 
	}

	public static void main(String[] args) {
		ListNode<Integer> list1 = randomSortedListGen(5, 3);
		ListNode<Integer> list2 = randomSortedListGen(5, 5);
		System.out.println("list1: " + list1.toString());
		System.out.println("list2: " + list2.toString());
		System.out.println();
		System.out.println("New merged list: " + mergeSortedLists(list1, list2).toString());
	}
}