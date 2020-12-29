# 2. Add Two Numbers
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
*/
public class Leetcode2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode temp = l3;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode(carry%10);
            carry/=10;
            temp=temp.next;
        }
        return l3.next;
    }
}
