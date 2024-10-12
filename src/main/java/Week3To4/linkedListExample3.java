/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3To4;

import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class linkedListExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<Character> ll = new LinkedList();
        ll.add('A');
        ll.add(0, 'B');
        ll.add('C');
        
        LinkedList<Character> ll1 = new LinkedList();
        ll1.add('D');
        ll1.add(0, 'E');
        ll1.add('F');
        //ll1.addAll(1, ll);
        ll1.addAll(ll);
        
        System.out.println("Linked List is "+ll1);
    }
    
}
