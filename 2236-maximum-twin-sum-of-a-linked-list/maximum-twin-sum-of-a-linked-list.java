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
    public int pairSum(ListNode head) {
        List<Integer> ls= new ArrayList<>();
        while(head!=null){
            ls.add(head.val);
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        int n = ls.size();
        for(int i = 0;i<n/2;i++){
            int sum = ls.get(i)+ls.get(n-i-1);
            if(sum>max) max = sum;
        }
        return max;
    }
}