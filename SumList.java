/*
Adds the linked lists integers where the ones starts at the head
*/


public class SumList {

	public static ListNode<Integer> sum(ListNode<Integer> l1, ListNode<Integer> l2) {
		// if either of the nodes are not null then keep going
		int count = 0;
		ListNode<Integer> currl1 = l1;
		ListNode<Integer> currl2 = l2;
		ListNode<Integer> sum = new ListNode<>();
		sum.data = 0;
		ListNode<Integer> currSum = sum; 

		while (currl1 != null || currl2 != null) {

			if (currl1 != null && currl2 != null) {
				int currTotal = currl1.data + currl2.data + currSum.data;
				if (currTotal > 9) {
					currTotal %= 10;
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 1;
				}
				else {
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 0;
				}
				currl1 = currl1.next;
				currl2 = currl2.next;
			}
			else if (currl1 != null) {
				int currTotal = currl2.data + currSum.data;
				if (currTotal > 9) {
					currTotal %= 10;
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 1;
				}
				else {
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 0;
				}
				currl2 = currl2.next;
			}
			else {
				int currTotal = currl1.data + currSum.data;
				if (currTotal > 9) {
					currTotal %= 10;
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 1;
				}
				else {
					currSum.data = currTotal;
					currSum.next = new ListNode<>();
					currSum = currSum.next;
					currSum.data = 0;
				}
				currl1 = currl1.next;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ListNode<Integer> l1 = ListNode.randGen(3);
		ListNode<Integer> l2 = ListNode.randGen(3);

		System.out.println("l1: " + l1);
		System.out.println("l2: " + l2);
		System.out.println("sum: " + sum(l1, l2));
	}
}