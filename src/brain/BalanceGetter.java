package brain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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
Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("139.59.117.11", 8080));
HttpURLConnection connection =(HttpURLConnection)new URL("http://bitcoinwhoswho.com/address/").openConnection(proxy);
        s = s.concat(rest);
        URL url = new URL(s);
        URLConnection connectio = url.openConnection();
        InputStream is = connectio.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int counter = 0;
        while ((line = br.readLine()) != null && counter < 1) {
            if ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(str2.toLowerCase())) {

                    counter = counter + 1;
                    line = line.split("</div")[0];
                    line = line.replace("trblb_right_column", "");
                    line = line.replace("<div class=\"col-md-3 \">", "");
                    line = line.replace("transaction_times_first", "");
                    line = line.replace(" ", "");
                    balance = line;

                }
            }
        }

        if (balance.contains("<divclass=\"col-md-3\"id=\"transaction_times_last\">")) {
            return "fail";

        }
        return balance;

    }

}
