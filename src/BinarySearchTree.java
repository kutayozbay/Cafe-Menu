
public class BinarySearchTree implements IBinarySearchTree{
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() 
    { 
        root = null; 
    } 

    public void deleteKey(int key) 
    { 
        root = deleteRec(root, key); 
    } 
	public Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
	}


	public int minValue(Node root) {
		int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
	}
	public int maxValue(Node root) {
		int maxv = root.key; 
        while (root.right != null) 
        { 
            maxv = root.right.key; 
            root = root.right; 
        } 
        return maxv; 
	}
	public void insert(int key) 
    { 
        root = insertRec(root, key); 
    } 
	public Node insertRec(Node root, int key) {
		/* If the tree is empty, return a new node */
        if (root == null) 
        { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
	}
	public void inorder() 
    { 
        inorderRec(root); 
    } 
	public void inorderRec(Node root) {
		if (root != null) 
        { 
            inorderRec(root.left); 
            System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
		
	}
	public void reverseorder()
	{
		reverseorderRec(root);
	}
	public void reverseorderRec(Node root){
		if (root != null) 
        { 
            inorderRec(root.right); 
            System.out.print(root.key + " "); 
            inorderRec(root.left); 
        } 
	}







	

}
