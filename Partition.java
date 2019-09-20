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
		ListNode<Integer> prevLeft = new ListNode<>();
		ListNode<Integer> prevRight = new ListNode<>();
		ListNode<Integer> prevMiddle = new ListNode<>();



		while (curr != null) {
			// System.out.println(curr.data);
			if (curr.data < partition) {
				currLeft.data = curr.data;
				prevLeft = currLeft;
				currLeft.next = new ListNode<>();
				currLeft = currLeft.next;
			}
			else if (curr.data > partition) {
				currRight.data = curr.data;
				prevRight = currRight;
				currRight.next = new ListNode<>();
				currRight = currRight.next;
			}
			else {
				currMiddle.data = curr.data;
				prevMiddle = currMiddle;
				currMiddle.next = new ListNode<>();
				currMiddle = currMiddle.next;
			}
			curr = curr.next;
		}

		prevLeft.next = middle;
		if (right.data != null) {
			prevMiddle.next = right;
		}
		else {
			prevMiddle.next = null;
		}
		prevRight.next = null;
		if (left.data != null) {
			return left;
		}
		else {
			return middle;
		}
	}

	public static void main(String[] args) {
		ListNode<Integer> list = ListNode.randGen(10);
		System.out.println(list);
		System.out.println(run(list, 4));
	}
}