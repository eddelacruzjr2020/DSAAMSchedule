/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5To6;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class StackExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack is "+stack);
        
        System.out.println("Peek of stack is "+stack.peek());
        System.out.println("Pop of stack is "+stack.pop());
        System.out.println("New Stack is "+stack);
        System.out.println("Is Empty "+stack.empty());
        
        stack.clear();
        System.out.println("new Is Empty "+stack.empty());

           System.out.println("Search Dog "+stack.search("Dog"));
            System.out.println("Search Apple "+stack.search("Apple"));
    }
    
}
