
/**
 * Write a description of class TableOrganizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TableOrganizer
{
    public static String[][] words; 
    
    public static String[][] organizeWords(String path)
    {
        //load the file with words
        FileOpener fp = new FileOpener();
        fp.loadFile(path);
        words = new String[FileOpener.getConwords().length][2];
        
        //toss words from .txt file into 2D array for the table
        for(int i = 0; i < words.length; i++)
        {
            words[i][0] = fp.getConwords()[i]; 
            words[i][1] = fp.getTranslations()[i];
        }
        
        return words;
    }
}
