/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* insertIntoBST(struct TreeNode* root, int val) {
    struct TreeNode* temp = root;
    struct TreeNode* newn = ( struct TreeNode*)malloc(sizeof(struct TreeNode));
    newn->left = newn->right = NULL;
    newn->val = val;
    if(root==NULL)  return newn;
    while(1 && temp!=NULL){
        if(temp->val>val){
            if(temp->left==NULL){
                temp->left =  newn;
                break;
            }else{
                temp = temp->left;
            }
        }else{
            if(temp->right==NULL){
                temp->right =  newn;
                break;
            }else{
                temp = temp->right;
            }
        }
    }
    return root;
}