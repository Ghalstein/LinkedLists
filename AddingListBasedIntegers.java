public class AddingListBasedIntegers {

	public static int add(ListNode<Integer> l1, ListNode<Integer> l2) {

		// summation tracker
		int sum = 0;
		int power = 0;

		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				sum += l1.data * Math.pow(10, power) + l2.data * Math.pow(10, power);
				l1 = l1.next;
				l2 = l2.next;
			}
			else if (l1 == null) {
				sum += l2.data * Math.pow(10, power);
				l2 = l2.next;
			}
			else {
				sum += l1.data * Math.pow(10, power);
				l1 = l1.next;
			}
			++power;
		}
		return sum;
	}

	public static void main(String[] args) {
		ListNode<Integer> l1 = ListNode.randGen(2);
		ListNode<Integer> l2 = ListNode.randGen(2);

		System.out.println("l1: " + l1);
		System.out.println("l2: " + l2);
		System.out.println("sum: " + add(l1, l2));
	}
}