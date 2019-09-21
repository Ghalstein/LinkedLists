/*
Adds the linked lists integers where the ones starts at the head
*/


public class SumList {

	public static ListNode<Integer> sum(ListNode<Integer> l1, ListNode<Integer> l2) {
		// if either of the nodes are not null then keep going
		int count = 0;
		ListNode<Integer> currl1 = l1;
		ListNode<Integer> currl2 = l2;

		while (currl1 != null || currl2 != null) {

			if (currl1 != null && currl2 != null) {
				currl1.data * Math.pow(10, count) + currl2.data * Math.pow(10, count);
				currl1 = currl1.next;
				currl2 = currl2.next;
			}
			else if (currl1 != null) {
				currl2.data * Math.pow(10, count);
				currl2 = currl2.next;
			}
			else {
				currl1.data * Math.pow(10, count);
				currl1 = currl1.next;
			}
		}
	}

	public static void main(String[] args) {

	}
}