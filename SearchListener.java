
/**
 * Write a description of class SearchListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SearchListener implements ActionListener
{
    private JButton button;
    
    public SearchListener(JButton b)
    {
        button = b;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        SearchFrame sf = new SearchFrame(button);
        button.setEnabled(false);
    }
}
