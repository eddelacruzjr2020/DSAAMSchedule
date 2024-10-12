/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3To4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class linkedListExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Collection<Integer> collect = new ArrayList();
        collect.add(89);
        collect.add(50);
      
        
        LinkedList<Integer> ll = new LinkedList(collect);
        ll.add(100);
        ll.add(99);
        ll.add(200);
        
        System.out.println("LinkedList is "+ll);
        
        
        
    }
    
}
