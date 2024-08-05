/**
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private static int[] arr = new int[100000];
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        final int[] a = arr;
        int size = 0;
        while(head!=null){
            a[size++] = head.val;
            head = head.next;
        }
        int m = size/2;
        for(int i=0;i<m;i++){
            if(a[i]!=a[--size]){
                return false;
            }
        }
        return true;
    }
}