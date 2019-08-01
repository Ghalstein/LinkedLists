import java.util.*;
public class isPalindromic {

	// adds a tails to end of the linked list
	public static void addTail(ListNode <Integer> list) {
		ListNode<Integer> curr = list;
		while (curr.next != null) {
			curr = curr.next;
		}
		ListNode<Integer> tail = new ListNode<>();
		curr.next = tail;
	}


	public static boolean valid(ListNode <Integer> list) {
		// key holds index and value holds value
		HashMap<Integer, Integer> listMap = new HashMap<>();
		ListNode<Integer> curr = list;

		int count = 0;
		while (curr != null) {
			listMap.put(++count, curr.data);
			curr = curr.next;
		}

		int j = count;
		for (int i = 1; i < count / 2; ++i) {
			if (listMap.get(i) != listMap.get(j--)) {
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args) {
		ListNode<Integer> list = new ListNode<>();
		list.data = 1;
		list.next = new ListNode<>();
		list.next.data = 2;
		list.next.next = new ListNode<>();
		list.next.next.data = 2;
		list.next.next.next = new ListNode<>();
		list.next.next.next.data = 2;

		System.out.println(valid(list));
	}
}