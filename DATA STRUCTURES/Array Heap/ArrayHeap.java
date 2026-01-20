// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Coding Quiz 4
//
// =========================== Requirements =============================== 
// Implement the insertion and deletion operations on an array-based heap.
// These two operations were introduced on pages 4 and 5 of Module 6 slides.
// You will need to write Java methods for upHeap and downHeap procedures
// which are invoked by the insert and the remove methods, respectively.
//
// The ArrayHeap class is coded as a subclass of the ArrayBinaryTree class,
// which is provided in the file "ArrayBinaryTree.java".
//
// Your output should be:
// ------------------------------------------------------------------------
// ******************** Test insert ********************
// 
// Original heap: 2 5 6 9 7 
// Inserting a new node with key 1 ...
// New heap: 1 5 2 9 7 6 
// 	
// ******************** Test remove ********************
// 	
// The minimum element is: 1. Removing it ...
// Heap after first removal: 2 5 6 9 7 
// The next minimum element is: 2. Removing it ...
// Heap after second removal: 5 7 6 9 
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "ArrayHeap.java" to compile and run.
// 4. Place the file "ArrayBinaryTree.java" in the same folder as your
//    current file to compile and run the code.
//
// ========================================================================

public class ArrayHeap<E extends Comparable<E>> extends ArrayBinaryTree<E> {	
	
    // Constructors:
    public ArrayHeap() { super(); }
    
    public ArrayHeap(int capacity) { super(capacity); }
    
    // returns the height of the heap
    public int height() {
        return (int)Math.ceil(Math.log(this.size + 1) / Math.log(2)) - 1;
    }
    
    // returns the root/minimum element of the heap
    public E min() throws IllegalStateException {
       if (size == 0)
           throw new IllegalStateException("Heap is empty.");
       return treeArray[0];
    }
    
    // inserts a node to the heap and maintains heap property
    public void insert(E element) throws IllegalStateException {
        if (size >= treeArray.length)
	        throw new IllegalStateException("Cannot insert element:" 
	        							+ " array capacity exceeded");
        treeArray[size] = element;
        upHeap(size);
        size++;
    }
    
    // removes the root from the heap and maintains heap property
    public E remove() throws IllegalStateException {
        if (size == 0)
            throw new IllegalStateException("Heap is empty.");

        E removedElement = treeArray[0];
        size--;

        if (size > 0) {
            treeArray[0] = treeArray[size];
            treeArray[size] = null;
            downHeap(0);
        } 
        else
            treeArray[0] = null;

        return removedElement;
    }
    
    // maintains heap property by upheap
    private void upHeap(int index) {
    	// YOUR CODE GOES HERE --Part 1/2--
    	while (index > 0) {
    		
            int parentIndex = getParentIndex(index);

    		if (treeArray[index].compareTo(treeArray[parentIndex]) < 0) {
    			
    			E temp = treeArray[index];
    			
    			treeArray[index] = treeArray[parentIndex];
    			
    			treeArray[parentIndex] = temp;
    			
    			index = parentIndex;
    			
    		}else {
    			
    			break;
    		}
    	}
    	
    }
    
    // maintains heap property by downheap
    private void downHeap(int index) {
    	// YOUR CODE GOES HERE --Part 2/2--
        while (getLeftChildIndex(index) < size && treeArray[getLeftChildIndex(index)] != null) {
        	
            int leftIndex = getLeftChildIndex(index), rightIndex = getRightChildIndex(index), ChildIndex = leftIndex;
            
            if (rightIndex < size && treeArray[rightIndex] != null &&
            		
                treeArray[rightIndex].compareTo(treeArray[leftIndex]) < 0) {
            	
                ChildIndex = rightIndex;
                
            }

           if (treeArray[index].compareTo(treeArray[ChildIndex]) > 0) {
        	   
        	   E temp = treeArray[index];
                                
               treeArray[index] = treeArray[ChildIndex];
                
               treeArray[ChildIndex] = temp;
                
               index = ChildIndex;
           
            } else {
              
            	break;   
            	
            }
       
        }
    
    }
   
    public static void main(String[] args) {
    	// Create a new ArrayHeap
        ArrayHeap<Integer> heap = new ArrayHeap<>();

        // Insert elements into the heap
        heap.insert(9);
        heap.insert(5);
        heap.insert(6);
        heap.insert(2);
        heap.insert(7);
       
        System.out.println("******************** Test insert ********************\n");
        // Print the heap
        System.out.println("Original heap: " + heap.toString());
        // Insert new element 1
        int k = 1;
        System.out.println("Inserting a new node with key " + k + " ...");
        heap.insert(1);
        System.out.println("New heap: " + heap.toString() + "\n");

        System.out.println("******************** Test remove ********************\n");
        // Remove the minimum key
        int min1 = heap.remove();
        System.out.println("The minimum element is: " + min1 + ". Removing it ...");
        System.out.println("Heap after first removal: " + heap.toString());
        
        // Remove the next minimum key
        int min2 = heap.remove();
        System.out.println("The next minimum element is: " + min2 + ". Removing it ...");
        System.out.println("Heap after second removal: " + heap.toString());

    }

}
