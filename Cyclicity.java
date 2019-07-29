public class Cyclicity {

	public static boolean isCyclic(ListNode<Integer> list) {
		ListNode<Integer> fast = list.next;
		ListNode<Integer> slow = list;

		// iterates through list
		while (fast != null) {
			// if they are equal then it is cyclic 
			if (fast == slow) {
				return true;
			}
			// if fast.next is not null then we can incrmeent it two
			else if (fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
			}
			else {
				return false;
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
		cyclic = cyclic.next.next;
		System.out.println("Cyclic: " + cyclic);
		System.out.println("Tests " + isCyclic(cyclic));
	}
}