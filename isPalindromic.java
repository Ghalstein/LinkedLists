import java.util.*;
// have to add a tail to the ListNode
public class isPalindromic {

	public static void addTail(ListNode <Integer> list) {
		ListNode<Integer> curr = list;
		while (curr.next != null) {
			curr = curr.next;
		}
		ListNode<Integer> tail = new ListNode<>();
		curr.next = tail;
	}


	public static boolean valid(ListNode <Integer> list) {

	}
	public static void main(String[] args) {

	}
}