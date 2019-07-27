import java.util.*;

public class RandomSortedLinkedListGenerator {

	public static LinkedList randomSortedListGen(int n, int init) {
		LinkedList<Integer> list = new LinkedList<>();
		int j = init;
		for (int i = 0; i < n; ++i) {
			int rand = j + 1 + (int)(Math.random() * 10); 
			list.add(rand);
			j = rand;
		}
		return list;
	}

	// private static int compSize(LinkedList l1, LinkedList l2) {
	// 	if (l1.size() > l2.size()) {
	// 		return l1.size();
	// 	}
	// 	else {
	// 		return l2.size();
	// 	}
	// }

	// public static LinkedList doubleTraverse(LinkedList l1, LinkedList l2) {
	// 	LinkedList<Integer> newList = new LinkedList<>();

	// 	// largetst index of iteration
	// 	int maxSize = compSize();
	// 	// iterating through until the ned of the largets array
	// 	for (int i = 0; i < maxSize; ++i) {
	// 		// if both linked list sizes are still within the range of i
	// 		if (i < l1.size() && i < l2.size()) {
	// 			li
	// 		}
	// 		// keep adding from larger list
	// 		else if (i < maxSize) {
	// 		}
	// 	}
	// 	return newList;
	// }

	public static void main(String[] args) {

		LinkedList l1 = randomSortedListGen(5, 3);
		LinkedList l2 = randomSortedListGen(5, 5);
	}
}