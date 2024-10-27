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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null){
            return list;
        }
        que.offer(root);
        TreeNode temp;
        while(!que.isEmpty()){
            ArrayList<Integer> ls = new ArrayList<>();
            int nodeCount = que.size();
            while(nodeCount-->0){
                temp = que.poll();
                // if(temp!=null){
                    ls.add(temp.val);
                    if(temp.left!=null){
                        que.offer(temp.left);
                    }
                    if(temp.right!=null){
                        que.offer(temp.right);
                    }
                // }
            }
            list.add(ls);
        }
        return list;
    }
    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> list = new ArrayList<>();
    //     Queue<TreeNode> que = new LinkedList<>();
    //     if(root==null){
    //         return list;
    //     }
    //     que.offer(root);
    //     TreeNode temp;
    //     while(!que.isEmpty()){
    //         Queue<TreeNode> q = new LinkedList<>();
    //         ArrayList<Integer> ls = new ArrayList<>();
    //         while(!que.isEmpty()){
    //             temp = que.poll();
    //             if(temp!=null){
    //                 ls.add(temp.val);
    //                 if(temp.left!=null){
    //                     q.offer(temp.left);
    //                 }
    //                 if(temp.right!=null){
    //                     q.offer(temp.right);
    //                 }
    //             }
    //         }
    //         que = q;
    //         list.add(ls);
    //     }
    //     return list;
    // }
}