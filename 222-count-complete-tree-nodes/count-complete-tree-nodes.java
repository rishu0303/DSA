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
    public int countNodes(TreeNode root) {
        if(root==null)  return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    } 

    // public int countNodes(TreeNode root) {
    //     int count = 0;
    //     if(root==null)  return 0;
    //     Stack<TreeNode> st = new Stack<>();
    //     st.push(root);
    //     while(!st.isEmpty()){
    //         count++;
    //         root = st.pop();
    //         if(root.right!=null)  st.push(root.right);
    //         if(root.left!=null)  st.push(root.left);
    //     }
    //     return count;
    // }
}