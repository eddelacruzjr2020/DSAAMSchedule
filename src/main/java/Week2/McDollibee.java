/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class McDollibee extends JFrame implements ActionListener{
    
    private JLabel hdrMcDollibee, lblBurger, lblBurgerCount, lblFries, lblFriesCount, lblSoda, lblSodaCount;
    private JButton addBurger, minusBurger, addFries, minusFries, addSoda, minusSoda, btnReview, btnReset;
    private JComboBox <String> cmbBurger, cmbFries, cmbSoda;
    private JTextArea txaSummary;
    private static final String[] sizes = {"Small", "Medium", "Large"};
    private int intburger = 0;
    private int intfries = 0;
    private int intsoda = 0;
    
    
    McDollibee(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding components
        hdrMcDollibee = new JLabel("Welcome to MCDolibee", SwingConstants.CENTER);
        hdrMcDollibee.setBounds(0, 10, 600, 30);
        
        //Burger
        lblBurger = new JLabel("Burger:");
        lblBurger.setBounds(50, 50, 100, 30);
        
        //Burger Count
        lblBurgerCount = new JLabel("0");
        lblBurgerCount.setBounds(160, 50, 50, 30);
        
        //Add Burger
        addBurger = new JButton("+");
        addBurger.setBounds(220, 50, 50, 30);
                
        //Minus Burger
        minusBurger = new JButton("-");
        minusBurger.setBounds(280, 50, 50, 30);
        
        //Burger Combo Box
        cmbBurger = new JComboBox<>(sizes);
        cmbBurger.setBounds(360, 50, 80, 30);
        
        //Fries
        lblFries = new JLabel("Fries:");
        lblFries.setBounds(50, 100, 100, 30);
        
        //Fries Count
        lblFriesCount = new JLabel("0");
        lblFriesCount.setBounds(160, 100, 50, 30);
        
        //Add Fries
        addFries = new JButton("+");
        addFries.setBounds(220, 100, 50, 30);
                
        //Minus Fries
        minusFries = new JButton("-");
        minusFries.setBounds(280, 100, 50, 30);
        
        //Fries Combo Box
        cmbFries = new JComboBox<>(sizes);
        cmbFries.setBounds(360, 100, 80, 30);
        
        //Soda
        lblSoda = new JLabel("Soda:");
        lblSoda.setBounds(50, 150, 100, 30);

        //Soda Count
        lblSodaCount = new JLabel("0");
        lblSodaCount.setBounds(160, 150, 50, 30);

        //Add Soda
        addSoda = new JButton("+");
        addSoda.setBounds(220, 150, 50, 30);

        //Minus Soda
        minusSoda = new JButton("-");
        minusSoda.setBounds(280, 150, 50, 30);

        //Soda Combo Box
        cmbSoda = new JComboBox<>(sizes);
        cmbSoda.setBounds(360, 150, 80, 30);
        
        //Review
        btnReview = new JButton("Review Order");
        btnReview.setBounds(50, 200, 120, 30);
        
        //Reset
        btnReset = new JButton("Reset Order");
        btnReset.setBounds(200, 200, 120, 30);
        
        //Summary Form
        txaSummary = new JTextArea();
        txaSummary.setBounds(50, 250, 500, 200);
        txaSummary.setEditable(false);
        
        //Adding components to Frame
        add(hdrMcDollibee);
        add(lblBurger);
        add(lblBurgerCount);
        add(addBurger);
        add(minusBurger);
        add(cmbBurger);
        add(lblFries);
        add(lblFriesCount);
        add(addFries);
        add(minusFries);
        add(cmbFries);
        add(lblSoda);
        add(lblSodaCount);
        add(addSoda);
        add(minusSoda);
        add(cmbSoda);
        add(btnReview);
        add(btnReset);
        add(txaSummary);
        
        //Add buttons to actionListener
        addBurger.addActionListener(this);
        minusBurger.addActionListener(this);
        addFries.addActionListener(this);
        minusFries.addActionListener(this);
        addSoda.addActionListener(this);
        minusSoda.addActionListener(this);
        btnReview.addActionListener(this);
        btnReset.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addBurger){
            intburger++;
            lblBurgerCount.setText(String.valueOf(intburger));
        }else if(e.getSource() == minusBurger){
            if(intburger > 0){
                intburger--;
            lblBurgerCount.setText(String.valueOf(intburger));
            }
        }else if(e.getSource() == addFries){
            intfries++;
            lblFriesCount.setText(String.valueOf(intfries));
        }else if(e.getSource() == minusFries){
            if(intfries > 0){
                intfries--;
            lblFriesCount.setText(String.valueOf(intfries));
            }
        }else if(e.getSource() == addSoda){
            intsoda++;
            lblSodaCount.setText(String.valueOf(intsoda));
        }else if(e.getSource() == minusSoda){
            if(intsoda > 0){
                intsoda--;
            lblSodaCount.setText(String.valueOf(intsoda));
            }
        }else if(e.getSource() == btnReview){
            double totalCost = 0.0;
         
            totalCost+=calculateCost(intburger, (String)cmbBurger.getSelectedItem());
            totalCost+=calculateCost(intfries, (String)cmbFries.getSelectedItem());
            totalCost+=calculateCost(intsoda, (String)cmbSoda.getSelectedItem());
            
            txaSummary.setText("Burger ("+cmbBurger.getSelectedItem()+"): "+intburger+"\n" +
                               "Fries ("+cmbFries.getSelectedItem()+"): "+intfries+"\n" +
                               "Soda ("+cmbSoda.getSelectedItem()+"): "+intsoda+"\n" +
                               "Total Cost: $"+totalCost+"");
        }else if(e.getSource() == btnReset){
            txaSummary.setText("");
            intburger = 0;
            lblBurgerCount.setText(String.valueOf(intburger));
            intfries = 0;
            lblFriesCount.setText(String.valueOf(intfries));
            intsoda = 0;
            lblSodaCount.setText(String.valueOf(intsoda));
            cmbBurger.setSelectedIndex(0);
            cmbFries.setSelectedIndex(0);
            cmbSoda.setSelectedIndex(0);
            
        }
                 
    }
    
    private double calculateCost(int count, String size){
        double price = 0.0;
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        return count*price;
    }
    
}
