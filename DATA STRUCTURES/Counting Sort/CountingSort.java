// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Bonus Coding Quiz
//
// =========================== Requirements =============================== 
// Implement the counting sort algorithm to sort elements of an array
// into non-decreasing order.
//
// Please use appropriate data types and design appropriate output to
// demonstrate the correctness of your code.
//
// Your output may look as follows:
// ------------------------------------------------------------------------
// Input array: e a b a c k i k s f o c g 
// Sorted array: a a b c c e f g i k k o s 
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "CountingSort.java" to compile and run.
//
// ========================================================================

public class CountingSort {
  
    public static char[] countingSort(char arr[]) {
        // YOUR CODE GOES HERE --Part 1/2--
        int x = arr.length;
        
        char[] outputArray = new char[x]; 

        int[] countArray = new int[26];

        for (int i = 0; i < x; i++) {
        	
            countArray[arr[i] - 'a']++;
            
        }

        
        for (int i = 1; i < 26; i++) {
        	
            countArray[i] += countArray[i - 1];
            
        }

        for (int i = x - 1; i >= 0; i--) {

        	outputArray[countArray[arr[i] - 'a'] - 1] = arr[i];

        	countArray[arr[i] - 'a']--;
       
        }

        return outputArray;
        
    }

        
    

    public static void main(String[] args) {
        // Test the countingSort method on the following char array
        char arr[] = {'e', 'a', 'b', 'a', 'c', 'k', 'i', 'k', 's', 'f', 'o', 'c', 'g'};
        
        // YOUR CODE GOES HERE --Part 2/2--
        System.out.print("Input array: ");
        
        for (char givenArray : arr) {
        	
            System.out.print(givenArray + " ");
            
        }
        
        System.out.println();

        char[] sortedArray = countingSort(arr);

        System.out.print("Sorted array: ");
        
        for (char y : sortedArray) {
        	
            System.out.printf(y + " ");
            
        }
        
        
    }
    
}

//references https://www.geeksforgeeks.org/counting-sort/


        

