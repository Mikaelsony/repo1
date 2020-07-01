/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    private int count = 0;
    private TreeNode result;
    TreeNode KthNode(TreeNode pRoot, int k){
        inorder(pRoot,k);
        return result;
    }
    
    private void inorder(TreeNode pRoot,int k){
        if(pRoot == null || k <=count){
            return;
        }
        inorder(pRoot.left,k);
        count++;
        if(count == k){
            result = pRoot;
        }
        inorder(pRoot.right,k);
        
    }


}