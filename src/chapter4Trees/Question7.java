package chapter4Trees;
import java.util.LinkedList;

import CTCILibrary.*;

public class Question7 {

	/* Question
	 * 
	 * Find if one tree is subset of another tree.
	 * First tree in order of millions.
	 * Second tree is order of hundreds. 
	 */
	
	/*
	 * Answer
	 * 
	 * Find the smallest tree in logn time
	 * 
	 * Check the root of smallest tree in the bigget tree by bfs
	 * 
	 * wherever u find the root start 
	 */
		// TODO Auto-generated constructor stub
	public Question7() {
	}
		
    private static void findNode(LinkedList<TreeNode> li, TreeNode node, int dataFromT2)
    {    	    
    	if(node == null) return;
		
    	if(node.value == dataFromT2) li.add(node);
		
		findNode(li,node.left,dataFromT2);
		findNode(li,node.right,dataFromT2);		        	
    }
    
    private static boolean checkMatch(TreeNode T1, TreeNode T2)
    {
    	if(T1 == null && T2 == null) return true;
    	if(T1== null || T2 == null) return false;
    	
    	if(T1.value != T2.value) return false;
    	
    	if(checkMatch(T1.right, T2.right) &&
    			checkMatch(T1.left, T2.left)) return true;
    	
    	else return false;
    }
     
	public static void main(String[] args)
	{
		TreeNode head = new TreeNode(10);
		
		for(int i = 1;i < 10;i++)
		{
			head.add(i);
			//head.add(i+150);			
		}				
		
		TreeNode head2 = new TreeNode(5);
		for(int i = 6;i < 10;i++)
		{
			head2.add(i);				
		}		
		
		print(head);
		print(head2);
		
		LinkedList<TreeNode> li = new LinkedList<TreeNode>();
		findNode(li,head,head2.value);
					
		for(TreeNode tr  : li)
		{
			if(checkMatch(tr,head2)) System.out.println(tr.value);
		}
				
	}
	
	public static void print(TreeNode tr)
	{
		if(tr==null) return;
		System.out.println(tr.value);
		print(tr.left);
		
		print(tr.right);
	}
	
}
