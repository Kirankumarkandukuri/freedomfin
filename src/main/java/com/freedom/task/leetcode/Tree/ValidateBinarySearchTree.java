package com.freedom.task.leetcode.Tree;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 
    public boolean isValidBST(TreeNode root) {
      return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }
  
  public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
      if (root == null) return true;
      if (root.val >= maxVal || root.val <= minVal) return false;
      return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
  }
}
