import java.util.*;

public class RemoveSortedDuplicates {

	public static void remove(ListNode<Integer> list) {
		

		while (list.next != null) {
			if (list.data == list.next.data) {
				list.next = list.next.next;
			}
		}
	}

	public static void main(String[] args) {
		ListNode<Integer> testList = new ListNode<>();
		testList.data = 1;
		testList.next = new ListNode<>();
		testList.next.data = 1;
		remove(testList);
		System.out.println(testList);
	}
}