/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> ls = new ArrayList<>();
    public boolean findTarget(TreeNode root, int target) {
        int s = 0;
        inorder(root);
        int e = ls.size()-1;
        while(s<e){
            int val = ls.get(s)+ls.get(e);
            if(val==target) return true;
            else if(val<target) s++;
            else e--;
        }
        return false;
    }
    void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            ls.add(root.val);
            inorder(root.right);
        }
    }
}