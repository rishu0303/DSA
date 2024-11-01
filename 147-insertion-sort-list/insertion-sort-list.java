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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> ls = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ls.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ls);
        int i = 0;
        temp = head;
        while(temp!=null){
            temp.val = ls.get(i++);
            temp = temp.next;
        }
        return head;
    }
}