/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import static brain.BalanceGetter.Balancer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TransactionGetter {

    public static String balance;

    public static String Transer(String rest) throws IOException {

        String s = "http://bitcoinwhoswho.com/address/";
        String line = null;
        String str2 = "<div class=\"col-md-3 trblb_right_column\">";

        //concat gia siblirosi url 
        s = s.concat(rest);
        // constractoras url
        URL url = new URL(s);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int counter = 0;
        int counter2 = 0;
        int flopper = 0;
        while ((line = br.readLine()) != null && counter < 1) {
            if (line.toLowerCase().contains(str2.toLowerCase())) {
                line = line.replace("trblb_right_column", "");
                line = line.replace("<div class=\"col-md-3 \">", "");
                line = line.replace("</div>", "");
//                    counter = counter +1;

                flopper = flopper + 1;

                if (flopper == 2) {
                    line = line.replace(" ", "");
//                        System.out.println(line);
                    balance = line;
                }

            }
        }

        //tsekarisma oti den epistrefei tin selida loading an epistrefei loading returb fail
        
        return balance;

    }
}
