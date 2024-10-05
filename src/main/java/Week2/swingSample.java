/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.awt.Color;
import javax.swing.*;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class swingSample {
    
    swingSample(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JLabel hdrName = new JLabel("Welcome to DSA Class", SwingConstants.CENTER);
        hdrName.setBounds(250, 100, 150, 50);
        frame.add(hdrName);
        JButton clickMe = new JButton("Click Me!"); 
        clickMe.setBounds(250, 200, 150, 50);
        frame.add(clickMe);
        
        JTextField name = new JTextField();
        name.setBounds(250, 300, 150, 50);
        frame.add(name);
        
        JPasswordField password = new JPasswordField();
        password.setBounds(250, 400, 150, 50);
        frame.add(password);
        
        JTextArea area = new JTextArea();
        area.setBounds(250, 500, 150, 50);
        frame.add(area);
    }
    
}
