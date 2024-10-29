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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node = root;
        if(root==null)  return null;
        if(root.val==key){
            return helper(node);
        }
        while(node!=null){
            if(node.val>key){
                if(node.left!=null && node.left.val == key){
                    node.left = helper(node.left);
                    return root;
                }else   node = node.left;
            }else{
                if(node.right!=null && node.right.val==key){
                    node.right = helper(node.right);
                    return root;
                }else   node = node.right;
            }
        }
        return root;
    }
    public TreeNode helper(TreeNode node){
        if(node.left==null) return node.right;
        if(node.right==null)    return node.left;
        TreeNode temp = node.right;
        while(temp.left!=null)  temp = temp.left;
        temp.left = node.left;
        return node.right;
    }
}