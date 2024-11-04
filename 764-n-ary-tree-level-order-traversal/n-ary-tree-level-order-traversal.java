/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)  return list;
        Node temp;
        Queue<Node> mq = new LinkedList<>();
        mq.add(root);
        while(!mq.isEmpty()){
            int size = mq.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node front = mq.poll();
                arr.add(front.val);
                if(front.children!=null){
                    mq.addAll(front.children);
                }
            }
            list.add(arr);
        }
        return list;
    }
}