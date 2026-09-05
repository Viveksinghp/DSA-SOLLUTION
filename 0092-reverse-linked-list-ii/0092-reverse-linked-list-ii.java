class Solution {
    public void reverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre=null;
        ListNode Next=null; // head/ Null
        while(curr!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode a=null;
        ListNode b=null;
        ListNode c=null;
        ListNode d=null;
        int pos=1;
        while(temp!=null){
            if(pos==left-1) a=temp;
            if(pos==left) b=temp;
            if(pos==right+1) d=temp;
            if(pos==right) c=temp;
            temp=temp.next;
            pos++;   
        }
        if(a!=null) a.next=null;
        if(c!=null) c.next=null;
        reverseList(b);
        if(a!=null) a.next=c;
        b.next=d;
        if(a==null) return c;
        return head;
    }
}