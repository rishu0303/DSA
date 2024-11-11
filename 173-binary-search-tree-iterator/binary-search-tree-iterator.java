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
class BSTIterator {
    ArrayList<Integer> ls;
    int index;
    public BSTIterator(TreeNode root) {
        ls = new ArrayList<>();
        inorder(root);
    }
    void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            ls.add(root.val);
            inorder(root.right);
        }
    }
    
    public int next() {
        if(hasNext()){
            return ls.get(index++);
        }
        return -1;
    }
    
    public boolean hasNext() {
        return index<ls.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */