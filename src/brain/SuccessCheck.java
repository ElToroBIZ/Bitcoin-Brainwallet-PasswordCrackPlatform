/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SuccessCheck {
    static boolean rich =  false;
public static boolean SuccessChecker(double valuer,String wif3) throws IOException {
     
          if (valuer >= 0.00000001) {
                    System.out.println("FOUND");
                    System.out.println("LUCKY");
                    rich = true;
                    try (FileWriter fw = new FileWriter("C:\\Users\\Dell\\Desktop\\SUCCESFULL.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)) {
                        out.println("PRIVATE KEY IS   :  " + wif3 + "WITH BALANCE   :  " + valuer);

                        out.println("PRIVATE    " + wif3);
                        out.println("");
                    }
                    
                }
return rich;
}
}
