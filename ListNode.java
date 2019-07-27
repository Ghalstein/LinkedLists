// singly liked list
public class ListNode<T> {
	public T data;
	public ListNode<T> next;

	public static ListNode<Integer> search(ListNode<Integer> L, int key){ 
		while (L != null && L.data != key) {
			L = L.next;
		}
		// If key was not present in the list, L will have become null.
		return L;
	}

	// deletes the node proceding the specified node
	public static void delete(ListNode<Integer> node) {
		if (node.next != null) {
			node.next = node.next.next;
		}
	}

	public String toString(ListNode list) {
		String str = "[";
		
		// adding current data in the ListNode
		str += list.data;
		ListNode curr = list.next;
		// iteration of listNode
		while (curr != null) {
			str += curr.data + " "
			curr = curr.next;
		}
		str += "]";

		return str;
	}
}