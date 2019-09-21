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
	}

	// tests if the palidrome is valid or not
	public static boolean valid(ListNode<Integer> list) {
		// key is for the node in the list and vsalur is the occurences
		// HashMap<Integer, Integer> hash = HashMap<>();
		ListNod<Integer> curr = list;



	}

	public static void main(String[] args) {

	}
}