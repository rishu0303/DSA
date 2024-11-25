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
        // List<Integer> ls= new ArrayList<>();
        int arr[] = new int[100000];
        int n = 0;
        while(head!=null){
            arr[n++] = head.val;
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        // int n = ls.size();
        for(int i = 0;i<n/2;i++){
            int sum = arr[i] + arr[n-i-1];
            if(sum>max) max = sum;
        }
        return max;
    }
}