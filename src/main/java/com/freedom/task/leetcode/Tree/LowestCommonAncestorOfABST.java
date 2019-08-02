package com.freedom.task.leetcode.Tree;

public class LowestCommonAncestorOfABST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val<=p.val&&root.val>=q.val) return root;
         if(root.val<=q.val&&root.val>=p.val) return root;
        
        if(root.val>p.val&& root.val>q.val)
        return lowestCommonAncestor(root.left,p,q);
        else
          return lowestCommonAncestor(root.right,p,q);  
        
    }

}
