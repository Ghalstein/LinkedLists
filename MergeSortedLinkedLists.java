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

	// helper function for adding the contents of a ListNode to another ListNode
	private static void addTheRest(ListNode adder, ListNode addee) {
		if (adder != null) {
			addee.data = adder.data;
			adder = adder.next;
			while (adder != null) {
				addee.next = new ListNode<>();
				addee = addee.next;
				addee.data = adder.data;
				adder.data = adder.next;
			}
		}
	}

	public static ListNode randomSortedListGen(ListNode list1, ListNode list2) {
		// pointers for the two lists
		ListNode curr1 = list1;
		ListNode curr2 = list2;

		// empty list we will add to as we traverse through both lists
		ListNode<Integer> list = new ListNode<>();
		ListNode curr1 = list;

		while (curr1 != null || curr2 != null) {
			if (curr1 != null && curr2 != null) {
				if (curr1.data < curr2.data) {
					curr.data = curr1.data

					// making a new node on the multi list and moving curr to it
					curr.next = new ListNode<>();
					curr = curr.next();

					// moved on to the next node for this lsit
					curr1 = curr1.next;
				}
				else {
					curr.data = curr2.data

					// making a new node on the multi list and moving curr to it
					curr.next = new ListNode<>();
					curr = curr.next();

					// moved on to the next node for this lsit
					curr2 = curr2.next;
				}
			}
			// if curr2 is the remaining list to add from
			else if (curr1 == null) {

			}
			// if curr1 is the remaining list to add from
			else {

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