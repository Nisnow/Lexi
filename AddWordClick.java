
/**
 * Write a description of class AddWordClick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AddWordClick implements ActionListener
{
    private JButton button;
    
    public AddWordClick(JButton b)
    {
        button = b;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        AddWordFrame awf = new AddWordFrame(button);
        button.setEnabled(false);
    }
    
}
