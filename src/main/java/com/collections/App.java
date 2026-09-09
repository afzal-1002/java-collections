package com.collections;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   

        Stack<Integer> stack = new Stack<>();

        stack.add(45);
        stack.get(0);
      
        stack.push(4);
          stack.get(1);
        stack.remove(0);

        System.out.println(stack);

        System.out.println( "Hello World!" );
    }
}
