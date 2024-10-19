/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week5To6;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class QueueExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Queue<String> q1 = new PriorityQueue<>();
        Queue<String> q = new LinkedList<>();
        Queue<String> q3 = new ArrayDeque<>();
        
        
        Queue<String> q2 = new PriorityBlockingQueue<>(); //Specific for Thread Safety
        q.add("Dog");
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");
        q.add("Apple");

        
        System.out.println("Queue is "+q);
        
//        for(String fruits: q){
//            System.out.println(fruits);
//            Thread.sleep(500);
//        }

        System.out.println("Remove Apple "+q.remove("Apple"));
        System.out.println("New Queue is "+q);
        
        
        
        
        
 
    }
    
}
