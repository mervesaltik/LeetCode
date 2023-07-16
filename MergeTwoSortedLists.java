
class ListNode {

    // **** class members ****
    int val;
    ListNode next;

    // **** constructor(s) ****
    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val    = val;
        this.next   = next;
    }
}
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if (list1 == null){
           return list2;
       }
       if ( list2 == null){
           return list1;
       }

       if(list1.val < list2.val){
           list1.next = mergeTwoLists(list1.next , list2);
           return list1;
       } else {
           list2.next = mergeTwoLists(list2.next , list1 );
           return list2;
       }}}
     