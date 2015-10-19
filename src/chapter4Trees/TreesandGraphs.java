package chapter4Trees;

import CTCILibrary.TreeNode;

public class TreesandGraphs {	
	//answer 4.6
	//finds the next node in the BST
	private TreeNode findNextNode(TreeNode tr){
		//if tree is a node with right we got to right n return it
		//else if  no right is present, we 
		//it returns the right subtrees leftmost node , if right sub has no left tree it returns the right node
		if(tr.right != null)
		{
			TreeNode rightNode = tr.right;
			if(rightNode.left != null) return leftmost(rightNode.left);
			else return rightNode;				
		}
		   //if it has no right subtree it returns either the parent when its the left tree
		  //it returns the parents parent if its the right tree of the parent 
		//incase of right most leaf we must rprint an exception saying it has no nxt node
		else if(tr.parent != null)
		{
			TreeNode parent = tr.parent;
			if(parent.left.equals(tr)) 	return parent;
			
			else {
				TreeNode grandFather = parent.parent;
				
				if(grandFather.value > tr.value) 
				return parent.parent;
				
				else
					ExceptionCustom.storeMsg("It is the righmost value!!");
					
			}
		
		}
		
		return null;		
	}
	
	private TreeNode leftmost(TreeNode tr){
		while(tr != null){
			//base case
			if(tr.left == null) break;
			
				tr = tr.left;
		}		
		return tr;
	}
	
	private TreeNode findNextNode(int val, TreeNode root)
	{
		TreeNode node  = binarySearch(val, root);
		
		if(node != null)
			return findNextNode(node);
		else
			return null;
	}
	
	private TreeNode binarySearch(int a,TreeNode root)
	{
		if(root.value == a) return root;
		
		else if(root.value > a) return binarySearch(a, root.left);
		
		else if(root.value < a) return binarySearch(a, root.right);
		
		return null;
	}
	
	//-----------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(56);
		tree.addWithParent(22);
		tree.addWithParent(11);
		tree.addWithParent(25);
		tree.addWithParent(75);
		tree.addWithParent(70);
		tree.addWithParent(85);
		
		TreesandGraphs trg = new TreesandGraphs();
		
		TreeNode ans = trg.findNextNode(11, tree);
		if(ans != null)
			System.out.println(ans.value);
		else
			System.out.println(ExceptionCustom.getMsg());
	}
	
	static class ExceptionCustom {
	private static String exception = ""; 
	
	static void storeMsg(String st){
		exception +=st;
	}
	
	static String getMsg(){
		return exception;
	}
		
	}

}
