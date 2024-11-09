/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7To8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class binaryTree {
    
    node root;
    
    //constructor binary tree
    binaryTree(){
        root = null;
    }
    
    //method to add node to the tree
    public void add(int value){
        root = addRecursive(root, value);
    }
    
    
    //Add Recursive value
    private node addRecursive(node current, int value){
        if(current == null){
            return new node(value);
        }
        
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
    
    //In order transversal
    public void transverseInOrder(node node){
        if(node != null){
            transverseInOrder(node.left);
            System.out.print(" "+node.value);
            transverseInOrder(node.right);
        }
    }
    
    //Pre Order Transversal
    public void transversePreOrder(node node){
        if(node != null){
            System.out.print(" "+node.value);
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }
    
    //Post Order Transversal
    public void transversePostOrder(node node){
        if(node != null){
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            System.out.print(" "+node.value);
        }
    }
        
    
}
