// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Coding Quiz 5
//
// =========================== Requirements =============================== 
// Complete the findSuccessor and deleteNode methods in the BST class.
// These two operations were introduced on pages 10-11 and 13-15 of 
// Module 7 slides.
//
// The BST class is coded as a subclass of the MyBinaryTree class and is
// also using the BinaryTreeNode class, which are provided in the two files
// "MyBinaryTree.java" and "BinaryTreeNode.java".
//
// Your output should be:
// ------------------------------------------------------------------------
// BST (inorder): 1 2 4 5 6 7 8 9 10 
// BST (preorder): 6 2 1 4 5 9 7 8 10 
// 
// Successor of 2: 4
// Successor of 8: 9
//
// Deleting the node with key = 6 ...
// BST (inorder) after deleting 6 is: 1 2 4 5 7 8 9 10 
//
// Inserting the node with key = 6 back ...
// After inserting 6 back,
// BST (inorder) is: 1 2 4 5 6 7 8 9 10 
// BST (preorder) is: 7 2 1 4 5 6 9 8 10 
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "BST.java" to compile and run.
// 4. Place the two files "MyBinaryTree.java" and "BinaryTreeNode.java" 
//    in the same folder as your current file to compile and run the code.
//
// ========================================================================

public class BST<E extends Comparable<E>> extends MyBinaryTree<E> {
	
	// Constructors:
    public BST() { super(); }

    public BST(BinaryTreeNode<E> r) { super(r); }
    
    // Searching: Returns true if node with given key exists
    public boolean search(E element) {
        return searchNode(root, element) != null;
    }

    private BinaryTreeNode<E> searchNode(BinaryTreeNode<E> node, E element) {
        if (node == null || element.compareTo(node.getElement()) == 0)
            return node;
        else if (element.compareTo(node.getElement()) < 0)
            return searchNode(node.getLeft(), element);
        else
            return searchNode(node.getRight(), element);
    }
    
    // Returns the minimum key
    public E findMinimum() throws IllegalStateException {
    	if (root == null)
    		throw new IllegalStateException("Tree is empty");
        return findMinimum(root).getElement();
    }

    private BinaryTreeNode<E> findMinimum(BinaryTreeNode<E> node) {
        while (node.getLeft() != null)
            node = node.getLeft();
        return node;
    }
    
    // Returns the maximum key
    public E findMaximum() throws IllegalStateException {
    	if (root == null)
    		throw new IllegalStateException("Tree is empty");
        return findMaximum(root).getElement();
    }

    private BinaryTreeNode<E> findMaximum(BinaryTreeNode<E> node) {
        while (node.getRight() != null)
            node = node.getRight();
        return node;
    }
    
    // Returns the key of the successor of given element
    public E findSuccessor(E element) throws IllegalArgumentException {
        BinaryTreeNode<E> node = searchNode(root, element);
        if (node == null)
        	throw new IllegalArgumentException("Node with key = " + element + " does not exist!");
        BinaryTreeNode<E> successor = findSuccessor(node);
        if (successor == null)
        	throw new IllegalArgumentException("Node with key = " + element + " has no successor.");
        else
        	return successor.getElement();
    }
    
    private BinaryTreeNode<E> findSuccessor(BinaryTreeNode<E> node) {
    	// YOUR CODE GOES HERE --Part 1/3--    	
    	
    	if (node.getRight() != null) {
    		
            return findMinimum(node.getRight());
            
        }
    	
        BinaryTreeNode<E> predeccessor = node.getParent();
        
        while (predeccessor != null && node == predeccessor.getRight()) {
        	
            node = predeccessor;
            
            predeccessor = predeccessor.getParent();
            
        }
        
        return predeccessor;
        
    }
    // Inserts a node with given key
    public void insert(E element) {
        BinaryTreeNode<E> newNode = new BinaryTreeNode<>(element);
        if (root == null)
            setRoot(newNode);
        else
            insertNode(getRoot(), newNode);
    }

    private void insertNode(BinaryTreeNode<E> node, BinaryTreeNode<E> newNode) {
        int comparison = newNode.getElement().compareTo(node.getElement());
        if (comparison <= 0) {  // elements with same value will be inserted to the left
            if (node.getLeft() == null) {
                node.setLeft(newNode);
                newNode.setParent(node);
            }
            else
                insertNode(node.getLeft(), newNode);
        }
        else {
            if (node.getRight() == null) {
                node.setRight(newNode);
                newNode.setParent(node);
            }
            else
                insertNode(node.getRight(), newNode);
        }
    }
    
    // Deletes a node with given key
    public void delete(E element) throws IllegalArgumentException {
        BinaryTreeNode<E> nodeToDelete = searchNode(root, element);
        if (nodeToDelete == null)
        	throw new IllegalArgumentException("Node with key = " + element + " does not exist!");
        deleteNode(nodeToDelete);
    }

    private void deleteNode(BinaryTreeNode<E> nodeToDelete) {
    	// Case 1: Node to delete is a leaf (no children)
    	if (nodeToDelete.getLeft() == null && nodeToDelete.getRight() == null) {
            BinaryTreeNode<E> predeccessor = nodeToDelete.getParent();
            if (predeccessor == null)
                root = null; // Deleting the root node
            else if (predeccessor.getLeft() == nodeToDelete)
                predeccessor.setLeft(null);
            else
                predeccessor.setRight(null);
            nodeToDelete.setParent(null);
        } 
    	// Case 2: Node to delete has only one child
    	// YOUR CODE GOES HERE --Part 2/3-- 
    	else if (nodeToDelete.getLeft() == null) {
    		
    	    BinaryTreeNode<E> child = nodeToDelete.getRight();
    	    
    	    BinaryTreeNode<E> parent = nodeToDelete.getParent();
    	    

    	    if (parent == null) {
    	    	
    	        setRoot(child);
    	        
    	        child.setParent(null);
    	        
    	    } else {
    	    	
    	        if (parent.getLeft() == nodeToDelete) {
    	        	
    	        	parent.setLeft(child);
    	        }
    	        
    	        else parent.setRight(child); {
    	        
    	        	child.setParent(parent);
    	        	
    	        }
    	        
    	    
    	        
    	    }

    	    nodeToDelete.setLeft(null);
    	    
    	    nodeToDelete.setRight(null);
    	    
    	    nodeToDelete.setParent(null);
    	    
    	}

    	
		
    	
    	// Case 3: Node to delete has two children
    	// YOUR CODE GOES HERE --Part 3/3-- 
        else {
            
        	BinaryTreeNode<E> predecessor = findMinimum(nodeToDelete.getRight());
            
        	nodeToDelete.setElement(predecessor.getElement());
           
        	deleteNode(predecessor);
       
        }
    
   }


    // ------------------------- Driver -------------------------
    public static void main(String[] args) {
        // Create an empty BST
    	BST<Integer> bst = new BST<>();

        // Insert nodes to BST
        Integer[] keys = {6, 2, 4, 9, 7, 1, 5, 8, 10};
        for (Integer i : keys)
        	bst.insert(i);
        
        // Print the BST using inorder traversal
        System.out.print("BST (inorder): ");
        bst.inOrderTraversal(bst.getRoot());
        System.out.println();
        
        // Print the BST using preorder traversal
        System.out.print("BST (preorder): ");
        bst.preOrderTraversal(bst.getRoot());
        System.out.println("\n");

        // Find successor
        Integer k1 = 2, k2 = 8;
        System.out.println("Successor of "  + k1 + ": " + bst.findSuccessor(k1));
        System.out.println("Successor of "  + k2 + ": " + bst.findSuccessor(k2));
        System.out.println();

        // Delete a node with given key value
        Integer k3 = 6;
        System.out.println("Deleting the node with key = " + k3 + " ...");
        bst.delete(k3);
        
        // Print the updated BST using inorder traversal
        System.out.print("BST (inorder) after deleting " + k3 + " is: ");
        bst.inOrderTraversal(bst.getRoot());
        System.out.println("\n");

        // Insert the deleted node back
        System.out.println("Inserting the node with key = " + k3 + " back ...");
        bst.insert(k3);
        
        System.out.println("After inserting " + k3 + " back,");
        // Print the updated BST using inorder traversal
        System.out.print("BST (inorder) is: ");
        bst.inOrderTraversal(bst.getRoot());
        System.out.println();
        
        // Print the BST using preorder traversal
        System.out.print("BST (preorder) is: ");
        bst.preOrderTraversal(bst.getRoot());
        System.out.println();
    }
}
