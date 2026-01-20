// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Coding Quiz 3
//
// =========================== Requirements =============================== 
//
// Implement the algorithm introduced on page 22 of Module 3 slides to test 
// if all brackets in a given string of expression are properly matched.
// That is, given a string containing three types of brackets, (), [], {},
// you will need to write a Java method using linked-list-based stack to 
// check if each "(" is paired with a ")", each "[" is paired with a "]", 
// and each "{" is paired with a "}" properly.
// 
// The three classes required for completing your implementation, namely 
// MySinglyLinkedList, Stack, and LinkedStack, are provided in the files
// "MySinglyLinkedList.java", "Stack.java", and "LinkedStack.java".
//
// Your output should be:
// ------------------------------------------------------------------------
// (                                    - Invalid!
// ()(()){([()])}                         - Valid!
// ((()(()){([()])}))                     - Valid!
// ({[])}                               - Invalid!
// )(()){([()])}                        - Invalid!
// ( ) ( ( ) ) {( [ ( )  ] ) }            - Valid!
// [(5+x)-(y+z)]                          - Valid!
// (3) (3 + (4 - 5) ) {( [ ( )  ] ) }     - Valid!
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "MatchBrackets.java" to compile and run.
// 4. Place the three files "MySinglyLinkedList.java", "Stack.java", and
//    "LinkedStack.java" in the same folder as your current file to compile 
//    and run the code succussfully.
//
// ========================================================================

public class MatchBrackets {

   public static boolean isMatched(String expression) {
      final String opening  = "([{";   // opening brackets
      final String closing  = ")]}";   // respective closing brackets
      
      // YOUR CODE GOES HERE --Part 1/1--
      /*
      Let S be an empty stack
      2 for i = 0 to n - 1
      3 if X[i] is an opening bracket
      4 S.push(X[i])
      5 else if X[i] is a closing bracket
      6 if S.isEmpty() return false // nothing to match with
      7 if X[i] does not match S.pop() return false
      8 return S.isEmpty() // all opening brackets got matched
      – Coding Quiz 3
      22/27
	  */
      LinkedStack<Character> S = new LinkedStack<>();
      
      for (char i : expression.toCharArray()) {
    	  
         if (opening.indexOf(i) != -1) {
        	 
            S.push(i);
            
         } else if (closing.indexOf(i) != -1) { 
        	 
            if (S.isEmpty()) { 
            	
               return false; //nothing to match
               
            }
            
            if (closing.indexOf(i) != opening.indexOf(S.pop())) {
            	
               return false;
               
            }
         
         }
      }
      
      return S.isEmpty(); //all opening brackets got matched
     
      
      
      
      
      
   }
       
   public static void main(String[] args) {
      String[] test = {
         "(",
         "()(()){([()])}",
         "((()(()){([()])}))",
         "({[])}",
         ")(()){([()])}",
         "( ) ( ( ) ) {( [ ( )  ] ) }",
         "[(5+x)-(y+z)]",
         "(3) (3 + (4 - 5) ) {( [ ( )  ] ) }"
      };

      for (String s : test)
         if (isMatched(s))
            System.out.printf("%-35s %12s", s, "- Valid!\n");
         else
            System.out.printf("%-35s %12s", s, "- Invalid!\n");
   }

}
