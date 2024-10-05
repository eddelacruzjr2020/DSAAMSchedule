/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class StudMain {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring Student Array
        student[] arr;
        
        //Array set size of 3
        arr = new student[3];
        
        
        //Set first student data [0]
        arr[0] = new student(123, "Ed");
        arr[1] = new student(345, "Dela");
        arr[2] = new student(999, "DSA");
        
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                               + arr[i].studName + " "
                               + arr[i].studName);
    }
               
        
    
    
    
    
    
}
