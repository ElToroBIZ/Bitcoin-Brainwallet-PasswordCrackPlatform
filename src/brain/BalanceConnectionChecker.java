package brain;

import static brain.BalanceGetter.Balancer;
import java.io.IOException;

public class BalanceConnectionChecker {

    public static String Checksos(String x) throws IOException, InterruptedException {

        x = Balancer(x);
        while (x == "fail") {
            x = Balancer(x);
        }
        double value = Double.parseDouble(x);
      if (value>=0.000001){
            while (true){
       
              x = null;
            }
        }
         

        return x;

    }

}
