class AddTwoNumbers {
    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> list = new ListNode<>();
        list.data = 0;
        ListNode<Integer> curr = list;
        while (l1 != null || l2 != null) {
            if (l1.data + l2.data > 9) {
                curr.next = new ListNode<>();
                curr.next.data = 1;
            }
            else if (l1.next != null && l2.next != null) {
                curr.next = new ListNode<>();
                curr.next.data = 0;
            }
            if (l1 != null && l2 != null) {
                curr.data += (l1.data + l2.data) % 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1 != null) {
                curr.data += l1.data;
                l1 = l1.next;
            }
            else {
                curr.data += l2.data;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        return list;
    }
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.randGen(3);
        ListNode<Integer> l2 = ListNode.randGen(3);
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println(addTwoNumbers(l1, l2));
    }
}