/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3To4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class linkedListExample4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      
        // TODO code application logic here
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("AM");
        ll.addFirst("DSA");
        ll.addFirst("Java");
        ll.addFirst("AM");
        ll.addLast("AM");
        ll.addLast("Test");
        
        
        System.out.println("LinkedList is "+ll);
//        ll.clear();
//        System.out.println("New LinkedList is "+ll);
//
//        LinkedList<String> ll1 = new LinkedList<>();
//        
//        ll1 = (LinkedList<String>) ll.clone();
//        System.out.println("New LinkedList is "+ll1);
//        ll1.add("Ed");
//        System.out.println("New LinkedList after Clone is "+ll1);
//        System.out.println("Is linkedlist has PM "+ll.contains("PM"));
//        System.out.println("Is linkedlist has AM "+ll.contains("AM"));
//
//            Iterator x = ll.descendingIterator();
//            
//            while(x.hasNext()){
//                System.out.println("Value of x is "+x.next());
//            }
//
//            System.out.println(ll.get(2));
//            System.out.println("Linkedlist first element is "+ll.getFirst());
//            System.out.println("Linkedlist last element is "+ll.getLast());
//              System.out.println("LinkedList index of "+ll.indexOf("AM"));
//              System.out.println("LinkedList index of "+ll.lastIndexOf("AM"));
//              ll.offerFirst("Fun");
//              System.out.println("New LinkedList is "+ll);
//                System.out.println(ll.get(0));
//                System.out.println("New LL after get "+ll);
//                System.out.println(ll.peek());
//                System.out.println("New LL after peek "+ll);
//                System.out.println(ll.peekFirst());
//                
//                ll.clear();
//                System.out.println(ll.peekFirst());
//                System.out.println(ll.peek());
//
//        System.out.println(ll.poll());
//        System.out.println("New Linkedlist is "+ll);
//            ll.pop();
//            System.out.println("New LL is "+ll);
//            ll.push("Java123");
//            System.out.println("New LL after push is "+ll);
//            System.out.println(ll.remove(6));\
//        System.out.println("LinkedList size is "+ll.size());
            System.out.println("To String is "+ll.toString());
            
        
    }
    
}
