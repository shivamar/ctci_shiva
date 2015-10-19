package CTCILibrary;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	
	//extra
	public TreeNode parent;
	
	public TreeNode()
	{
		
	}
	public TreeNode(int value) {
		this.value = value;
	}
			
	public TreeNode add(int a)
	{
		TreeNode root = this;
		
		if(root.value > a){
			
			if(root.left != null) 
			{
				TreeNode leftNode = root.left;
				return leftNode.add(a);				
			}			
			else 
			{
				TreeNode newNode = new TreeNode(a);											
				root.left = newNode;
				
				return root;
			}
		}		
		else if(a > root.value){
			if(root.right != null)
			{
				TreeNode rightNode = root.right;
				return rightNode.add(a);
			}
			else
			{
				TreeNode newNode = new TreeNode(a);
				root.right = newNode;
				return root;
			}
		}
		
		return null;
	}
	
	public TreeNode addWithParent(int a)
	{
		TreeNode root = this;
		
		if(root.value > a){
			
			if(root.left != null) 
			{
				TreeNode leftNode = root.left;
				return leftNode.addWithParent(a);				
			}			
			else 
			{
				TreeNode newNode = new TreeNode(a);	
				newNode.parent = root;
				root.left = newNode;
				
				return root;
			}
		}		
		else if(a > root.value){
			if(root.right != null)
			{
				TreeNode rightNode = root.right;
				return rightNode.addWithParent(a);
			}
			else
			{
				TreeNode newNode = new TreeNode(a);
				newNode.parent = root;
				root.right = newNode;
				
				return root;
			}
		}
		
		return null;
	}
	
	

}
