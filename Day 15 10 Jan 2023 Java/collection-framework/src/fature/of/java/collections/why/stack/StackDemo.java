package fature.of.java.collections.why.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	//The class supports one default constructor Stack() 
	//which is used to create an empty stack. 
		Stack stack1 = new Stack();
 
        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();
 
        // 1. Adding Elements: In order to add an element to the stack, we can use the push() method. 
        // This push() operation place the element at the top of the stack.
        stack1.push(4);
        stack1.push("4");
        stack1.push("Four");
 
        stack2.push("One");
        stack2.push("Two");
        stack2.push("Three");
 
        printBothStacks(stack1, stack2);
        stackSearch(stack2, "One");
        
        // Accessing the Element: To retrieve or fetch the first element of the Stack or the element present at the top of the Stack, we can use peek() method. 
        // The element retrieved does not get deleted or removed from the Stack like pop().
        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                           + " stack1 is: " + stack1.peek());
 
        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                           + " stack2 is: " + stack2.peek());
 
        printBothStacks(stack1, stack2);
        
        //3. Removing Elements: To pop an element from the stack, we can use the pop() method. 
        //The element is popped from the top of the stack and is removed from the same.
        //Removing elements using pop() method
        System.out.println("Popped element from stack1: "
                           + stack1.pop());
        System.out.println("Popped element from stack2: "
                           + stack2.pop());
        printBothStacks(stack1, stack2);
        
        
        stackSearch(stack2, "One");
        
        
	}
	
    
    // Searching element in the stack
    public static void stackSearch(Stack<String> stack, String element)
    {
    	//search(Object element) -
    	//It determines whether an object exists in the stack. If the element is found,
        //It returns the position of the element from the top of the stack. Else, it returns -1.
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

	public static void printBothStacks(Stack stack1, Stack<String> stack2) {
		// Printing the Stack Elements
        System.out.println("stack1:"+stack1);
        System.out.println("stack2:"+stack2);
	}
}


/*
 * Java Collection framework provides a Stack class that models and implements a
 * Stack data structure. 
 * The class is based on the basic principle of last-in-first-out. 
 * In addition to the basic push and pop operations, the
 * class provides three more functions of empty, search, and peek. 
 * The class can also be said to extend Vector and treats the class as a stack with the five
 * mentioned functions. 
 * The class can also be referred to as the subclass of Vector. 
 * 
 * Note: 
      1. Please note that the Stack class in Java is a legacy class and inherits from Vector in Java. 
      2. It is a thread-safe class and hence involves overhead when we do not need thread safety. 
	  3. It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.
*/