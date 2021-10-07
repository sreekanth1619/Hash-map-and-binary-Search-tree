package hashmapandbinarysearch;
/**
 * Purpose  - To create Binary Search Tree
 * @author  - sreekanth
 */
public class BinarySearchTree {
	  public static void main(String[] args) {
	        System.out.println("Welcome to the Program");
	        BinaryTree<Integer> myTree = new BinaryTree<>();
	        myTree.add(56);
	        myTree.add(30);
	        myTree.add(70);
	        myTree.print(myTree.root);
	    }
	}

