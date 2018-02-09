
/**
 * Write a description of class SearchFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SearchFrame extends JFrame
{
    private JTextField searchField;
    private JButton searchButton;
    
    private JButton buttonToDisable;
    
    public SearchFrame(JButton bte)
    {
        buttonToDisable = bte;
        
        setTitle("Search for a word");
        setSize(300, 300);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(75, 10, 75, 10));
        add(panel, BorderLayout.CENTER);
        
        searchField = new JTextField("Search word");
        
        panel.add(searchField);
        
        buttonToDisable.setEnabled(true);
    }
}
