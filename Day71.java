/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(first !=null && first.next != null){
            second = second.next;
            first = first.next.next;
            if(second == first)
                break;
        }
        if(first == null || first.next == null)
            return null;
        while(head != second){
            head = head.next;
            second = second.next;
        }
        return head;
            
        }
    }