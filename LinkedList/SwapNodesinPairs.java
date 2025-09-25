class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode first=null;   
        ListNode second=null;
        while(head!=null  && head.next!=null){
            first=head;
            second=head.next;
            prev.next=second;
            first.next=second.next;
            second.next=first;
            prev=first;
            head=first.next;
        }
        return dummy.next;
    }
}
