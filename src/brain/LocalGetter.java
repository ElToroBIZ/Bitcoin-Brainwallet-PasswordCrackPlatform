/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class LocalGetter {
    
     static String valuek="0";
    public static String localgetter(String texter) throws FileNotFoundException, IOException{
    try (Scanner sc = new Scanner(new File("C:\\Users\\Dell\\Desktop\\balances.csv"), "UTF-8")) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
                            StringBuilder str = new StringBuilder(line);
                str.setLength(34);
                String gogo = str.toString();
                line = gogo;
               
                if (texter.equals(gogo)){
                valuek="111";
                }
        }
        // note that Scanner suppresses exceptions
        if (sc.ioException() != null) {
            throw sc.ioException();
        }
    }
        return valuek;
    
    }
            
    
}
