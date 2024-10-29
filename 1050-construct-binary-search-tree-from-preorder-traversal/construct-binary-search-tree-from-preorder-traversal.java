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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node = new TreeNode(preorder[0]);
        TreeNode root = node;
        for(int i = 1;i<preorder.length;i++){
            insert(root,preorder[i]);
        }
        return root;
    }
    public void insert(TreeNode root, int val){
        TreeNode node = new TreeNode(val);
        if(root==null)  root = node;
        while(true){
            if(root.val>val){
                if(root.left!=null){
                    root = root.left;
                }else{
                    root.left = node;
                    return;
                }
            }else{
                if(root.right!=null){
                    root = root.right;
                }else{
                    root.right = node;
                    return;
                }
            }
        }
    }
}