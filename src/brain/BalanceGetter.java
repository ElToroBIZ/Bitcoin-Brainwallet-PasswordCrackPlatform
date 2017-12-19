package brain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class BalanceGetter {

    public static String balance;

    public static String Balancer(String rest) throws IOException, InterruptedException {


        String s = "http://bitcoinwhoswho.com/address/";
        String line = null;
        String str2 = "col-md-3 trblb_right_column";

        //concat gia siblirosi url 
        s = s.concat(rest);
        // constractoras url
        URL url = new URL(s);
        URLConnection con = url.openConnection();
        //String proxier = "145.239.87.247";
        //Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxier, 8080));
       // URLConnection con = new URL(s).openConnection(proxy);
        InputStream is = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int counter = 0;
        while ((line = br.readLine()) != null && counter < 1) {
            if ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(str2.toLowerCase())) {
                    //counter to stop at just one line and get only the balance
                    counter = counter + 1;
                    line = line.split("</div")[0];
                    //remove unwanted html data 
                    line = line.replace("trblb_right_column", "");
                    line = line.replace("<div class=\"col-md-3 \">", "");
                    line = line.replace("transaction_times_first", "");
                    //allign left remove spaces
                    line = line.replace(" ", "");
                    balance = line;

                }
            }
        }
        
        

        //tsekarisma oti den epistrefei tin selida loading an epistrefei loading returb fail
        if (balance.contains("<divclass=\"col-md-3\"id=\"transaction_times_last\">")) {
            return "fail";
            
        }
        return balance;

    }

}
