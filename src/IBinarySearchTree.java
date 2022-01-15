
public interface IBinarySearchTree {
	public int maxValue(Node root);
	public void inorder();
	public void reverseorder();
	public void reverseorderRec(Node root);
	public void insert(int key); 
	public void deleteKey(int key); 
	public Node deleteRec(Node root, int key);
	public int minValue(Node root);
	public Node insertRec(Node root, int key);
	public void inorderRec(Node root);
}
