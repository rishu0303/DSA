/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode rlist = reverse1(head);

        int carry = 0;
        ListNode curr = rlist;
        ListNode prev = null;
        while(curr != null)
        {
            int twice = 2*curr.val +carry;
            curr.val = twice%10;
            if(twice > 9)
                carry = 1;
            else
                carry = 0;
            prev = curr;
            curr = curr.next;
        }
        if(carry!=0)
        {
            ListNode extra = new ListNode(1);
            prev.next = extra;

        }
        ListNode ans = new ListNode();
        ans = reverse1(rlist);
        return ans;

    }
    ListNode reverse1(ListNode node) {
        ListNode prev = null, curr = node, nex;

        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        curr = prev;

        return curr;
    }
};