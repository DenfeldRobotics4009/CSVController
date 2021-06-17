/** Will record given values into a csv file located in home\lvuser
 *  Any type can be given and the file will record them.
 * 
 *  Able be used for non-FRC reasons.
 * 
 *  6/17/2021
 * 
 *  TODO: Do the reader and any other usefull things
 *  (will be done in other files)
 */

package Macro; // Change to desired workspace

import java.io.FileWriter;
import java.io.IOException;

public class writeCSV {
    private FileWriter writer;

    /**
     * Initializes a new csv writer according to file name and directory
     * @param fileName specified filename
     * @param dir path to add csv file to, if null is provided it will
     * default to "home\\lvuser\\"
     */
    public writeCSV(String fileName, String dir){ // Constructs new RecCSV
        if (dir == null){dir = "home\\lvuser\\";} // accepts null and defaults
        String file = dir + fileName + ".csv"; // Path string
        try{ writer = new FileWriter(file, true);} // Init writer
        catch(IOException e){e.printStackTrace();}
    }

    /**
     * Writes the given Object[] into the csv file,
     * seperates each variable with a ','
     * @param dat String[] of 
     */
    public void writeSet(Object[] dat){
        for (Object i: dat){
            try { writer.append(toString(i) + ","); }
            catch (IOException e) {e.printStackTrace();}
        }
        try {
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {e.printStackTrace();}
    }
    
    /** Closes the writer, be sure to run this
     * before code ends to avoid memory leak
     */
    public void close(){
        try { writer.close();}
        catch (IOException e) {e.printStackTrace();}
    }

    /**
     * Converts provided object to a string
     * @param obj object
     * @return object as the string
     */
    private String toString(Object obj) {
        String s=obj.toString();  
        String s2=String.valueOf(s);  
        return s2;
    }
        
    
}
