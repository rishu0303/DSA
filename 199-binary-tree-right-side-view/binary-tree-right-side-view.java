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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)  return list;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int nodeCount = que.size();
            int val = -1;
            while(nodeCount-->0){
                root = que.poll();
                val = root.val;
                if(root.left!=null)
                    que.offer(root.left);
                if(root.right!=null)
                    que.offer(root.right);
            }
            if(val!=-1)
                list.add(val);
        }
        return list;
    }
}