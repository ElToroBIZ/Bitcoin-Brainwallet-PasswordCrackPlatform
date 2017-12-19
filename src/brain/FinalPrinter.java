/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import static brain.AddressGenerator.AddressGenerator;
import static brain.Main.gens;
import static brain.PrivateKeyGetter.PrivateKeyGetter;
import static brain.BalanceConnectionChecker.Checksos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class FinalPrinter {
    
    
    public static void ROWER(String line) throws InterruptedException /*throws IOException, InterruptedException */{
        try /*throws IOException, InterruptedException */ {
            gens++;
            String TheAddress = AddressGenerator(line);
            String wif3 = PrivateKeyGetter(line);
            long start = System.nanoTime();
            long elapsedTime = System.nanoTime() - start;
            float elapsedTimeSec;
            elapsedTimeSec = elapsedTime / 1000F;
            String test1 =Checksos(TheAddress);
            if (test1==null){
            
              
                try (FileWriter fw = new FileWriter("C:\\Users\\Dell\\Desktop\\ADDRESSESWITHBALANCE.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw)) {
                    out.println("ADDRESS    :" + TheAddress + "PRIVATE KEY   :"+wif3 + "BALANCE  :"+ test1);
                    
                    out.println("");

                } catch (IOException e) {
                }
            }
                
            System.out.println("----------------");
            System.out.println("BALANCE: " + test1 + " BTC" + "  ADDR: " + TheAddress + "  PRV.KEY:  " + wif3 );
            System.out.println("----------------");
        } catch (IOException ex) {
            Logger.getLogger(FinalPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    
}
}
