
/**
 * Write a description of class AddWordFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AddWordFrame extends JFrame implements ActionListener
{
    private JTextField inputConword;
    private JTextField inputTrans;
    private JButton okay;
    private JButton cancel;
    
    public AddWordFrame()
    {
        //create the window
        setTitle("Add new word");
        setSize(300, 300);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        //add panel and add it to frame
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(75, 10, 75, 10));
        add(panel, BorderLayout.CENTER);
        
        //input text fields
        inputConword = new JTextField("New conword");
        inputTrans = new JTextField("Translation");
        
        panel.add(inputConword);
        panel.add(inputTrans);
        
        //button panel for below
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        add(buttonPanel, BorderLayout.PAGE_END); 
        
        okay = new JButton("Okay");
        //addActionListener....
        
        cancel = new JButton("Cancel");
        //also here
        
        buttonPanel.add(okay);
        buttonPanel.add(cancel);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //this doesn't work yet
        if(e.getSource() == okay)
        {
            //toss new word into table
            this.dispose();
        }
        else if(e.getSource() == cancel)
        {
            this.dispose();
        }
    }
}
