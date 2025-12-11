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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        while(!queue.isEmpty())
        {
            List<Integer> temp=new ArrayList<>();
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                TreeNode node=queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                temp.add(node.val);
            }
            res.add(temp);
        }
        Collections.reverse(res);

    return res;
        
    }
}