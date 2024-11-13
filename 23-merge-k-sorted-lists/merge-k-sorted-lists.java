/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len==0)  return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(int i = 0;i<lists.length;i++){
            while(lists[i]!=null){
                ListNode next = lists[i].next;
                lists[i].next = null;
                pq.offer(lists[i]);
                lists[i] = next;
            }
        }
        if(pq.isEmpty())    return null;
        ListNode head = pq.poll();
        ListNode temp = head;
        while(!pq.isEmpty()){
            temp.next = pq.poll();
            temp = temp.next;
        }
        return head;
    }
}