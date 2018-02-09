
/**
 * Write a description of class AlphabetListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;

public class AlphabetListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        //TODO: e.getSource() == one of the buttons
        try
        {
            Alphabetizer a = new Alphabetizer();
            a.sortWordsByConlang();
        }
        catch(Exception exc)
        {
            System.out.println("There's nothing open, ya dingus. " + exc.getMessage());
        }
    }
}
