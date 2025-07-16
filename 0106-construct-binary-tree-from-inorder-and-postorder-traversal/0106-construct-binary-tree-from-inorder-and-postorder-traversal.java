class Solution {
    int pind;
    Map<Integer,Integer> s1=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pind=postorder.length-1;
        
        for(int i=0;i<inorder.length;i++)
        {
            s1.put(inorder[i],i);

        }
        return helper(postorder,inorder,0,inorder.length-1);
    }
    public TreeNode helper (int [] postorder,int [] inorder,int s,int e)
    {
        if (s > e)return null;
        
        int val=postorder[pind--];
        TreeNode root=new TreeNode(val);
        int ind=s1.get(val);
        
             
       root.right = helper(postorder, inorder, ind + 1, e);
        root.left = helper(postorder, inorder, s, ind - 1);

        return root;
    }
        
}