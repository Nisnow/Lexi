
/**
 * Write a description of class Window here.
 *
 * @author Catherine Guevara
 * @version 1/22/2018 -- 
 */

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Window extends JFrame implements ActionListener
{
    public static JButton newButton, openButton;
    public static String[][] words = new String[0][0];
    public static String[] tableNames = {"Conlang", "Translation"};
    public static final DefaultTableModel dtable = new DefaultTableModel(words, tableNames);
    
    public static JTable wordTable;
    
    public Window()
    {
        //thank the Lord for GUI editors, yeesh
        setSize(1500, 1000);
        setResizable(true);
        setVisible(true);
        
        setTitle("Lexi"); //+ conlang lexicon name open
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
        Box verticalBox = Box.createVerticalBox();
        verticalBox.setAlignmentY(Component.TOP_ALIGNMENT);
        getContentPane().add(verticalBox);
        
        JToolBar toolBar = new JToolBar();
        toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
        verticalBox.add(toolBar);
        
        newButton = new JButton("New lexicon");
        toolBar.add(newButton);
        
        Component horizontalStrut = Box.createHorizontalStrut(20);
        toolBar.add(horizontalStrut);
        
        JFileChooser fc = new JFileChooser();
        
        JPanel panel_1 = new JPanel();
        
        openButton = new JButton("Open lexicon");
        toolBar.add(openButton);
        
        
        JSplitPane splitPane = new JSplitPane();
        verticalBox.add(splitPane);
        
        
        
        
        JPanel panel = new JPanel();
        splitPane.setLeftComponent(panel);
        panel.setLayout(new GridLayout(0, 1, 0, 10));
        
        Component verticalStrut = Box.createVerticalStrut(20);
        panel.add(verticalStrut);
        
        JButton addButton = new JButton("Add word");
        panel.add(addButton);
        
        JButton deleteButton = new JButton("Delete word");
        panel.add(deleteButton);
        
        JButton searchButton = new JButton("Search word");
        panel.add(searchButton);
        
        JButton alphabetizeButton_1 = new JButton("Alphabetize by Conlang");
        panel.add(alphabetizeButton_1);
        
        JButton alphabetizeButton_2 = new JButton("Alphabetize by Translation");
        panel.add(alphabetizeButton_2);
        
        Component verticalStrut_1 = Box.createVerticalStrut(20);
        panel.add(verticalStrut_1);
        
        
        
        wordTable = new JTable(dtable);
        
        JScrollPane scrollPane = new JScrollPane(wordTable);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        panel_1.add(scrollPane);
        
     
        splitPane.setRightComponent(panel_1);
        TxtOpener txto = new TxtOpener(fc, openButton, this, panel);
        panel_1.setLayout(new GridLayout());
        openButton.addActionListener(txto);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    
    }
    
    public static void main(String[] args)
    {
        Window window = new Window();
    }
}
