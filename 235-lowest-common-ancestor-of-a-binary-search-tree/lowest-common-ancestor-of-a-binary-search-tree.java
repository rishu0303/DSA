/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<TreeNode> ls = new ArrayList<>();
        TreeNode temp = root;
        if(root.val==p.val||root.val==q.val)    return root;
        while(true){
            ls.add(temp);
            if(temp.val==p.val) break;
            else if(temp.val>p.val)  temp = temp.left;
            else temp = temp.right;
        }
        int i = 0;
        temp = root;
        while(i<ls.size() && ls.get(i).val==temp.val){
            // ls.add(temp.val);
            if(temp.val==q.val) return temp;
            if(temp.val>q.val)  temp = temp.left;
            else temp = temp.right;
            i++;
        }
        return ls.get(--i);
    }
}