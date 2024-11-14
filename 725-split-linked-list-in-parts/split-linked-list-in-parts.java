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
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] list = new ListNode[k];
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }

        int size = n / k;
        int rem = n % k;
        for(int i = 0;i<k;i++){
            list[i] = head;
            int len = size;
            if (rem > 0) {
                rem -= 1;
                len += 1;
            }
            int j = 1;
            while(j<len && head!=null){
                head = head.next;
                j++;
            }
            if(head!=null){
                temp = head.next;
                head.next = null;
                head = temp;
            }else head = null;
        }
        return list;
    }
}