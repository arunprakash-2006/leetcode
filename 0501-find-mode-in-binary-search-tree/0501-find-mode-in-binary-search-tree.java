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
    Map<Integer,Integer> m1=new HashMap<>();
    public int[] findMode(TreeNode root) {
        preorder(root);
        int max=Integer.MIN_VALUE;
        for(int k:m1.values())
        {
            //System.out.println(k);
            max=Math.max(max,k);
        }
         System.out.println(max);
        List<Integer> mode =new ArrayList<>();
        for(int key:m1.keySet())
        {
            if(m1.get(key)==max) mode.add(key);
        }

        int [] ans=new int[mode.size()];
        for(int i=0;i<mode.size();i++)
        {
            ans[i]=mode.get(i);
        }

        return ans;
        
        
    }

    void preorder(TreeNode root)
    {
        if(root==null) return;
        if(m1.containsKey(root.val))
        {
            m1.put(root.val,m1.get(root.val)+1);
        }
        else
        {
            m1.put(root.val,1);
        }

        preorder(root.left);
        preorder(root.right);
    }
}