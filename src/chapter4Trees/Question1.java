package chapter4Trees;

import CTCILibrary.TreeNode;

public class Question1 {

	public Question1() {
		// check if height if sub-tree differs max by one
	}

	public static int findHeight(TreeNode root)
	{
		if(root == null) return 0;
		int height = Math.max(findHeight(root.left)+1, findHeight(root.right)+1);
		
		return height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(99);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(20);
		root.right.right.right = new TreeNode(20);
		root.right.right.right.right = new TreeNode(20);
		
		int result = findHeight(root.left)-findHeight(root.right);
		result *= result;
		System.out.println(result < 2);
		
		
		
		
	}

}
