/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import static brain.BalanceGetter.Balancer;
import static brain.Main.zeros;

import static brain.TransactionGetter.Transer;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class errorsolver {
    
    public static String Checksos(String x) throws IOException, InterruptedException{
       
        x = Balancer(x);
          while (x=="fail"){
          x = Balancer(x);
          }
          double value = Double.parseDouble(x);
//        if (value>=0.000001){
//            while (true){
//       
//              System.out.println("LUCKY");
//            }
//        }
//         
        
        return x;
    
    }
    
        public static String Checksos1(String x) throws IOException{
         
            x = Transer(x);
          
          while (x==null){
               x = Transer(x);
          }
         ;
         
        
         
        
        return x;
    
    }
    
}
