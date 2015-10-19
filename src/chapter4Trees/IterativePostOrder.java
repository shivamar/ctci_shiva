package chapter4Trees;

import CTCILibrary.TreeNode;
import java.util.*;

public class IterativePostOrder {

	/*
	 * add the roots left until the leaf ; if the tree has right sub tree add the right 
	 * before the root and continue
	 * 
	 * pop the stack and keep printing it until u come across the first node of 
	 * the right subtree
	 * where u then need to traverse the right subtree the same way in a 
	 * loop building the stack.
	 * 
	 */
	public void getPostOrderTraversal(TreeNode root)
	{
		Stack<TreeNode> s  = new Stack<TreeNode>();
		
		while(true)
		{
			while(root != null)
			{
				if(root.right != null) s.push(root.right);
				
				s.push(root);
				
				root = root.left;
			}
			
			if(!s.isEmpty())root = s.pop();
			else break;
			
			if(!s.isEmpty() && root.right == s.peek()){
				//swap the elements in the stack so root is added and root.right is added 
				//last so that the root.right is run in the loop 
				
				TreeNode rightSub = s.pop();				
				s.push(root);
				root = rightSub;
			}
			else
			{
				//keep printing the stacks top value 
				//without interruption until the right elements of the root is at the top
				//where the right subtree needs to be checked
				print(root.value);
				root = null;
			}
			
		}
	}
	public IterativePostOrder(TreeNode root) {
//		if(root == null) return;
//		TreeNode curr = root;
//		
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.push(root);
//		
//		boolean isPrint= false;
//		
//		while(!stack.isEmpty()){
//			curr = stack.pop();
//			
//			//add right to stack
//		   //add root to stack
//			//add left to stack and repeat until no left is there
//			//print the last left and change a flag
//			if(!isPrint)
//			{
//				if(curr.right != null){
//					stack.push(curr.right);
//					stack.push(curr);
//				}
////				else{
////					stack.push(curr);
////				}
//				
//				if(curr.left != null){	
//					if(curr.right == null) stack.push(curr);
//					stack.push(curr.left);
//				}
//				else {				
//					print(curr.value);
//					isPrint = true;
//				}
//		   }			
//			else 
//			{				
//				//check if the root and stack top is same by peeking.
//				//if same swap the root and stack top position and bring on the flag
//				//else pop and print the root
//			
//				if(!stack.isEmpty() && curr.right == stack.peek())
//				{
//					TreeNode rightNode = stack.pop();
//					stack.push(curr);
//					stack.push(rightNode);
//					isPrint = false;
//				}
//				else{
//					print(curr.value);					
//				}
//			}
//			
//		}
		
	}

	private void print(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(8);
		
		IterativePostOrder itr = new IterativePostOrder(root);
		itr.getPostOrderTraversal(root);
		
	}

}
