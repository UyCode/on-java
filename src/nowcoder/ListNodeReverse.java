package nowcoder;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 10/4/2021
 */

public class ListNodeReverse {
    public static ListNode reverseListNode(ListNode headNode) {
        ListNode newHead = null;
        ListNode current = headNode;
        while (current != null) {
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(2);

        System.out.println(reverseListNode(list).val);
    }
}
