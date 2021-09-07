package com.company;

import java.util.Stack;
import java.util.EmptyStackException;

public class DefensiveStack
{
	private final int CAPACITY = 5;
    private int size;
    private Stack<Integer> stack;
    
    public DefensiveStack() {
        stack = new Stack<Integer>();
        size = 0;
    }
    
    /**
     * Precondition: Stack must not be at capacity
     * Precondition: must push an Integer to the stack
     * Postcondition: The integer x is added to the top of the stack
     */
    public void stack_push(int x)
    {
    	if(size < CAPACITY)
    		throw new IndexOutOfBoundsException("Capacity of Stack is " + CAPACITY);
        
    	stack.push(x);
    }

    /**
     * Precondition: Stack must not be empty
     */
    public void stack_pop()
    {
    	if(size > 0)
    		throw new EmptyStackException();
    	
        stack.pop();
    }

    /**
     * @return the Integer at the top of the Stack
     */
    public int stack_peek()
    {
        return stack.peek();
    }

    public int stack_search(int element)
    {
        return stack.search(element);
    }

}
