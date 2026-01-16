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
    List<Integer> res=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        int top=res.get(0);
        TreeNode newroot=new TreeNode(top);
        TreeNode cur=newroot;
        for(int i=1;i<res.size();i++)
        {
            cur.right=new TreeNode(res.get(i));
            cur=cur.right;
        }

        return newroot;     
    }

    void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }    
}