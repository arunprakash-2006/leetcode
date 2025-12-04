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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> a1=new ArrayList<>();
        fun(root,a1,"");
        return a1;
        
    }

    public void fun(TreeNode root,List<String> a1,String a)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) 
        {
            a=a+String.valueOf(root.val);
            a1.add(a);
            return;
        }

        a=a+String.valueOf(root.val)+"->";
        fun(root.left,a1,a);
        fun(root.right,a1,a);
    }
}