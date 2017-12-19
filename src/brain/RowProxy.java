/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import static brain.AddressGenerator.AddressGenerator;
import static brain.Main.gens;
import static brain.PrivateKeyGetter.PrivateKeyGetter;
import static brain.errorsolver.Checksos;
import static brain.errorsolver.Checksos1;
import static brain.errorsolver_1.ChecksosProxy;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class RowProxy {
    
    
    public static void ROWERPROXY(String line) throws InterruptedException /*throws IOException, InterruptedException */{
        try /*throws IOException, InterruptedException */ {
            gens++;
            String TheAddress = AddressGenerator(line);
            String wif3 = PrivateKeyGetter(line);
            long start = System.nanoTime();
            long elapsedTime = System.nanoTime() - start;
            float elapsedTimeSec;
            elapsedTimeSec = elapsedTime / 1000F;
            String test1 =Checksos1(TheAddress);
            System.out.println("----------------");
            System.out.println("BALANCE: " + test1 + " BTC" + "  ADDR: " + TheAddress + "  PRV.KEY:  " + wif3 );
            System.out.println("----------------");
        } catch (IOException ex) {
            Logger.getLogger(Row.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    
}
}
