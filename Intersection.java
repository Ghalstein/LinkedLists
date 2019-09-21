/*
Need to see if there is any crossover
Easiest way is to iterate through and compare final node 
Maybe can just go through with a hash and see if same node is found in both
*/


import java.util.*;

public class Intersection {

	private static boolean intersect(ListNode<Integer> l1, ListNode<Integer> l2) {
		ListNode<Integer> currl1 = l1;
		ListNode<Integer> currl2 = l2;

		while (currl1.next != null) {
			currl1 = currl1.next;
		}

		while (currl2.next != null) {
			currl2 = currl2.next;
		}

		if (currl1 == currl2) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

	}
}