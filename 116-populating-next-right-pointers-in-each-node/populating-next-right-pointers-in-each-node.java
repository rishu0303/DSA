// /*
// // Definition for a Node.
// class Node {
//     public int val;
//     public Node left;
//     public Node right;
//     public Node next;

//     public Node() {}
    
//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val, Node _left, Node _right, Node _next) {
//         val = _val;
//         left = _left;
//         right = _right;
//         next = _next;
//     }
// };
// */

// class Solution {
//     public Node connect(Node root) {
//         Queue<Node> que = new LinkedList<>();
//         if(root==null){
//             return root;
//         }
//         que.offer(root);
//         Node temp;
//         while(!que.isEmpty()){
//             int nodeCount = que.size();
//             while(nodeCount-->1){
//                 temp = que.poll();
//                 if(temp.left!=null){
//                     que.offer(temp.left);
//                 }
//                 if(temp.right!=null){
//                     que.offer(temp.right);
//                 }
//                 temp.next = que.peek();
//             }
//             temp = que.poll();
//             temp.next = null;
//             if(temp.left!=null){
//                     que.offer(temp.left);
//             }
//             if(temp.right!=null){
//                 que.offer(temp.right);
//             }
//         }
//         return root;
//     }
// }
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        bfs(queue);
        return root;
    }
    public void bfs(Queue<Node> queue){
        Queue<Node> temp=new LinkedList<>();
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr==null){
                continue;
            }
            if(curr.left!=null){
                temp.add(curr.left);
            }
            if(curr.right!=null){
                temp.add(curr.right);
            }
            curr.next=queue.peek();
        }
        if(!temp.isEmpty()){
            bfs(temp);
        }
    }
}