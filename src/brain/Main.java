package brain;

import static brain.FinalPrinter.ROWER;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static int counter_1 = 0;
    public static int counter = 0;
    public static int ggg0 = 0;

    public static String[] adds0 = new String[1000];

    public static int gens = 0;
    public static int zeros = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        System.out.println("  ____            _    __        __    _ _      _     ____             _       _____                       \n"
                + " | __ ) _ __ __ _(_)_ _\\ \\      / /_ _| | | ___| |_  | __ ) _ __ _   _| |_ ___|  ___|__  _ __ ___ ___ _ __ \n"
                + " |  _ \\| '__/ _` | | '_ \\ \\ /\\ / / _` | | |/ _ \\ __| |  _ \\| '__| | | | __/ _ \\ |_ / _ \\| '__/ __/ _ \\ '__|\n"
                + " | |_) | | | (_| | | | | \\ V  V / (_| | | |  __/ |_  | |_) | |  | |_| | ||  __/  _| (_) | | | (_|  __/ |   \n"
                + " |____/|_|  \\__,_|_|_| |_|\\_/\\_/ \\__,_|_|_|\\___|\\__| |____/|_|   \\__,_|\\__\\___|_|  \\___/|_|  \\___\\___|_|   \n"
                + "                                                                                                           ");
        System.out.println("LOADING.....");
        System.out.println();
        BufferedReader zero = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\baby.txt"));

        while (counter < 999) {
            String line0 = zero.readLine();
            adds0[counter_1] = line0;
            counter++;
            counter_1++;

        }

        for (int i = 0; i <= 1222; i++) {

            ggg0++;
            gens++;
            System.out.println("GENERATING WITH SEED: " +adds0[ggg0]);
            ROWER(adds0[ggg0]);
            
            System.out.println("ADRRESS no#  :" + gens / 2);

        }
    }

}
