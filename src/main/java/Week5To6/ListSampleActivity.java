/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5To6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ListSampleActivity extends JFrame implements ActionListener{
    
    private DefaultListModel<String> listModel;
    private LinkedList<String> linkedList;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JTextField txtField;
    private JButton btnAdd, btnRemove;
    
    ListSampleActivity(){
        linkedList = new LinkedList<>();
        listModel = new DefaultListModel<>();
        
        
        setTitle("List Sample App");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        //Create JList and ScrollPane
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(10, 10, 260, 180);
        add(scrollPane);
        
        
        //Create textField and Button
        txtField = new JTextField();
        txtField.setBounds(10, 200, 160, 30);
        add(txtField);
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(190, 200, 80, 30);
        add(btnAdd);
        btnAdd.addActionListener(this);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(190, 200, 80, 30);
        add(btnRemove);
        btnRemove.addActionListener(this);
       
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
             String listItem = txtField.getText();
         if(!listItem.isEmpty()){
             linkedList.add(listItem); //Adding item to the List
             listModel.addElement(listItem);
             txtField.setText("");
         }else{
             JOptionPane.showMessageDialog(this, "Add List item first", "Error", JOptionPane.ERROR_MESSAGE);
         }
         
        }else if(e.getSource() == btnRemove){
            int indexSelected = list.getSelectedIndex();
            if(indexSelected!=-1){
                linkedList.remove(indexSelected);
                listModel.removeElement(indexSelected);
            }else{
                JOptionPane.showMessageDialog(this, "Select item to remove first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
