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
    public int maxLevelSum(TreeNode root) {

        return level(root);
        
    }

    public int level(TreeNode root)
    {
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        int sum;
        int max=Integer.MIN_VALUE;
        int level=0;
        int maxi=0;
        while(!q1.isEmpty())
        {
            level++;
            sum=0;
            int size=q1.size();
            for(int i=0;i<size;i++)
            {
                TreeNode ele=q1.poll();
                if(ele.left!=null) q1.add(ele.left);
                if(ele.right!=null) q1.add(ele.right);
                sum+=ele.val;

            }

            if(sum>max)
            {
                max=sum;
                maxi=level;
            }
        }

        return maxi;
    }
}