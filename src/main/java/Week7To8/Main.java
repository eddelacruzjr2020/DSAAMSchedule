/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week7To8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        binaryTree tree = new binaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(6);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        
        
        //transversing of tree
        
        //In order
        System.out.print("\nIn Order Tranversal");
        tree.transverseInOrder(tree.root);
        
         //In order
        System.out.print("\nPre Order Tranversal");
        tree.transversePreOrder(tree.root);
        
        //Post order
        System.out.print("\nPost Order Tranversal");
        tree.transversePostOrder(tree.root);
    }
    
}
