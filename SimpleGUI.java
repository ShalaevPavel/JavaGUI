package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleGUI extends JFrame implements ActionListener{
    private final JButton button;
    private final JButton button2;
    private final JTextField textField;
    private final JTextField textField2;
    private final JLabel label;


    public SimpleGUI (){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        //create a panel to hold the components
        JPanel panel = new JPanel();
        //create a label to hold the text
        label = new JLabel(" ");

        //create a text field to hold the user input
        textField = new JTextField(50);
        textField2 = new JTextField(50);
        //create a button to submit the data
        button = new JButton("Concatenate");
        button.addActionListener(this);

        button2 = new JButton("Clear");
        button2.addActionListener(this);
        //add the components to the panel

        panel.add(textField);
        panel.add(textField2);
        panel.add(button);
        panel.add(button2);
        panel.add(label);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if button is clicked shpw the text in the text field
        if(e.getSource() == button){
            label.setText("result of concatenation is " + textField.getText() + textField2.getText());

        }
        if(e.getSource() == button2){
            label.setText(" ");
            textField.setText(" ");
            textField2.setText(" ");
        }

    }
}


class RunSimpleGUI{
    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
    }
}