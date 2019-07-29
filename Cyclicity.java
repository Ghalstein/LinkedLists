public class Cyclicity {

	public static boolean isCyclic(ListNode<Integer> list) {
		ListNode<Integer> fast = list;
		ListNode<Integer> slow = list;

		// iterates through list
		while (fast != null && fast.next != null) {
			// if they are equal then it is cyclic 
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ListNode<Integer> list = ListNode.randGen(10);
		System.out.println("Non-cyclic: " + list);
		System.out.println("Tests " + isCyclic(list));

		System.out.println();
		ListNode<Integer> cyclic = new ListNode<Integer>();
		cyclic.next = new ListNode<Integer>();
		cyclic.next.next = new ListNode<Integer>();
		cyclic.next.next.next = cyclic;
		System.out.println("Cyclic: " + cyclic);
		System.out.println("Tests " + isCyclic(cyclic));
	}
}