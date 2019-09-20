/*
Removing all duplicates in the list 
Create a hash as I go
if hash contains the key remove the node from the linked list
*/

import java.util.*;

public class RemoveUnsortedDuplicates {

	public static void remove(ListNode<Integer> list) {
		HashSet<Integer> hash = new HashSet<>();
		ListNode<Integer> curr = list;
		// for the first node in the list
		hash.add(curr.data);
		// iterating through the rest of the list
		while (curr != null) {
			if (hash.contains(curr.next.data)) {
				curr.next = curr.next.next;
			}
			else {
				hash.add(curr.next.data);
			}
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		ListNode<Integer> list = new ListNode<>();
		list.data = 1;
		list.next = new ListNode<>();
		list.next.data = 2;
		list.next.next = new ListNode<>();
		list.next.next.data = 1;
		list.next.next.next = new ListNode<>();
		list.next.next.next.data = 2;
		list.next.next.next = new ListNode<>();
		list.next.next.next.data = 3;
		list.next.next.next.next = new ListNode<>();
		list.next.next.next.next.data = 2;
		System.out.println("before: " + list);
		remove(list);
		System.out.println("after: " + list);
	}
}