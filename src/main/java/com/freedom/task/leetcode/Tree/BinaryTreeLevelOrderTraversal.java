package com.freedom.task.leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public List<List<Integer>> levelOrder(TreeNode root) {
	     List<List<Integer>> res = new ArrayList<>();  
	if (root == null) return res;  
	Queue<TreeNode> queue = new LinkedList<>();  
	queue.add(root);  
	while (!queue.isEmpty()) {  
		List<Integer> level = new ArrayList<>();
	
     int cnt = queue.size();  
	for (int i = 0; i < cnt; i++) {  
	TreeNode node = queue.poll();  
	level.add(node.val);  
	if (node.left != null) {  
	queue.add(node.left);  
	}
 if (node.right != null) {  
	queue.add(node.right);  
	}
	res.add(level);   
	}

	}  
	return res;
	    }
	    
}
