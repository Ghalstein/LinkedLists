import java.util.*;

public class RemoveSortedDuplicates {

	public static void remove(ListNode<Integer> list) {
		// tracer
		ListNode<Integer> curr = list;

		while (curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}
			else {
				curr = curr.next;
			}
		}
	}

	public static void main(String[] args) {
		ListNode<Integer> testList = new ListNode<>();
		testList.data = 1;
		testList.next = new ListNode<>();
		testList.next.data = 1;
		testList.next.next = new ListNode<>();
		testList.next.next.data = 1;
		remove(testList);
		System.out.println(testList);
	}
}