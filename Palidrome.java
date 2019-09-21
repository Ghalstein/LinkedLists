/*
check if list node is palidromic by making a hashmap as we go through it
without a tail need to iterate the whole listnode
*/

import java.util.*;

public class Palidrome {

	private static int size(ListNode<Integer> list) {
		ListNode<Integer> curr = list;
		int count = 0;
		while (curr != null) {
			++count;
			curr = curr.next;
		}
		return count;
	}

	private static boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	// tests if the palidrome is valid or not
	public static boolean valid(ListNode<Integer> list) {
		// key is for the node in the list and vsalur is the occurences
		ListNode<Integer> curr = list;
		int size = size(list);

		// iterating through the list nodes and tracking the order
		int count = 0;
		int[] firstHalf = new int[size / 2];
		while (count < size / 2) {
			firstHalf[count++] = curr.data;
			curr = curr.next;
		}

		if (isOdd(size)) {
			curr = curr.next;
		}

		while (curr != null) {
			if (firstHalf[--count] != curr.data) {
				// System.out.println(firstHalf[count + 1]);
				// System.out.println(curr.data);
				return false;
			}
			curr = curr.next;
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
		list.next.next.next.next = new ListNode<>();
		list.next.next.next.next.data = 1;
		System.out.println(valid(list));
	}
}