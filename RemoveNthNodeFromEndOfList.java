/* Example 1 : Input : head = [1,2,3,4,5], n = 2
 * Output : [1,2,3,5]
 * 
 * Example 2 : Input : head = [1], n = 1
 * Output : []
 * 
 * Example 3 : Input : head = [1,2], n = 1
 * Output : [1]
 * */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    
}}
