public class Partition {

	public static ListNode<Integer> run(ListNode<Integer> list, int num) {

		ListNode<Integer> curr = list;
		int count = 1;
		int partition = 0;
		// finds the value of the partition
		while (curr != null) {
			if (count == num) {
				partition = curr.data;
				break;
			}
			curr = curr.next;
			++count;
		}

		curr = list;
		ListNode<Integer> left = new ListNode<>();
		ListNode<Integer> right = new ListNode<>();
		ListNode<Integer> middle = new ListNode<>();
		ListNode<Integer> currMiddle = middle;
		ListNode<Integer> currLeft = left;
		ListNode<Integer> currRight = right;



		while (curr != null) {
			if (curr.data < partition) {
				currLeft.data = curr.data;
				currLeft = currLeft.next;
			}
			else if (curr.data < partition) {
				currRight.data = curr.data;
				currRight = currRight.next;
			}
			else {
				currMiddle.data = curr.data;
				currMiddle = currMiddle.next;
			}
		}

		currLeft = middle;
		currMiddle = right;
		
		return currLeft;
	}

	public static void main(String[] args) {

	}
}