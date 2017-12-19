
package brain;

import static brain.Row.ROWER;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static int counter_1 = 0;
    public static int counter = 0;
    public static int ggg0 = 0;
    public static int ggg1 = 0;
    public static int ggg2 = 0;
    public static int ggg3 = 0;
    public static int ggg4 = 0;
    public static int ggg5 = 0;
    public static int ggg6 = 0;
    public static int ggg7 = 0;
    public static int ggg8 = 0;
    public static int ggg9 = 0;
    public static String[] adds0 = new String[1000];
    public static String[] adds1 = new String[1000];
    public static String[] adds2 = new String[1000];
    public static String[] adds3 = new String[1000];
    public static String[] adds4 = new String[1000];
    public static String[] adds5 = new String[1000];
    public static String[] adds6 = new String[1000];
    public static String[] adds7 = new String[1000];
    public static String[] adds8 = new String[1000];

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
        BufferedReader zero = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk1.txt"));
        BufferedReader first = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk2.txt"));
        BufferedReader second = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk3.txt"));
        BufferedReader third = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk4.txt"));
        BufferedReader fourth = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk5.txt"));
        BufferedReader fifth = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk6.txt"));
        BufferedReader sixth = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk7.txt"));
        BufferedReader seventh = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk8.txt"));
        BufferedReader eight = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk9.txt"));
        BufferedReader nine = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk10.txt"));
        BufferedReader ten = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk11.txt"));
        BufferedReader eleven = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk12.txt"));
        BufferedReader twelve = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk13.txt"));
        BufferedReader thirteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk14.txt"));
        BufferedReader fourteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk15.txt"));
        BufferedReader fifteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk16.txt"));
        BufferedReader sixteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk1.txt"));
        BufferedReader seventeen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk2.txt"));
        BufferedReader eighteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk3.txt"));
        BufferedReader nineteen = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk4.txt"));
        BufferedReader twenty = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk5.txt"));
        BufferedReader twentyone = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk6.txt"));
        BufferedReader twentytwo = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk7.txt"));
        BufferedReader twentythree = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk8.txt"));
        BufferedReader twentyfour = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk9.txt"));
        BufferedReader twentyfive = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk10.txt"));
        BufferedReader twentysix = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk11.txt"));
        BufferedReader twentyseven = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk12.txt"));
        BufferedReader twentyeight = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk13.txt"));
        BufferedReader twentynine = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk14.txt"));
        BufferedReader thirty = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk15.txt"));
        BufferedReader thirtyone = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\splitted\\disk16.txt"));

        while (counter < 999) {
            String line0 = zero.readLine();
            String line1 = first.readLine();
            String line2 = second.readLine();
            String line3 = third.readLine();
            String line4 = fourth.readLine();
            String line5 = fifth.readLine();
            String line6 = sixth.readLine();
            String line7 = seventh.readLine();
            String line8 = eight.readLine();
            String line9 = nine.readLine();
            String line10 = ten.readLine();
            String line11 = eleven.readLine();
            String line12 = twelve.readLine();
            String line13 = thirteen.readLine();
            String line14 = fourteen.readLine();
            String line15 = fifteen.readLine();
            String line16 = sixteen.readLine();
            String line17 = seventeen.readLine();
            String line18 = eighteen.readLine();
            String line19 = nineteen.readLine();
            String line20 = twenty.readLine();
            String line21 = twentyone.readLine();
            String line22 = twentytwo.readLine();
            String line23 = twentythree.readLine();
            String line24 = twentyfour.readLine();
            String line25 = twentyfive.readLine();
            String line26 = twentysix.readLine();
            String line27 = twentyseven.readLine();
            String line28 = twentyeight.readLine();
            String line29 = twentynine.readLine();
            String line30 = thirty.readLine();
            String line31 = thirtyone.readLine();

            StringBuilder str0 = new StringBuilder(line0);
            str0.setLength(34);
            String gogo0 = str0.toString();
            line0 = gogo0;
            StringBuilder str1 = new StringBuilder(line1);
            str1.setLength(34);
            String gogo1 = str1.toString();
            line1 = gogo1;
            StringBuilder str2 = new StringBuilder(line2);
            str2.setLength(34);
            String gogo2 = str2.toString();
            line2 = gogo2;
            StringBuilder str3 = new StringBuilder(line3);
            str3.setLength(34);
            String gogo3 = str3.toString();
            line3 = gogo3;
            StringBuilder str4 = new StringBuilder(line4);
            str4.setLength(34);
            String gogo4 = str4.toString();
            line4 = gogo4;
            StringBuilder str5 = new StringBuilder(line5);
            str5.setLength(34);
            String gogo5 = str5.toString();
            line5 = gogo5;
            StringBuilder str6 = new StringBuilder(line6);
            str6.setLength(34);
            String gogo6 = str6.toString();
            line6 = gogo6;
            StringBuilder str7 = new StringBuilder(line7);
            str7.setLength(34);
            String gogo7 = str7.toString();
            line7 = gogo7;
            StringBuilder str8 = new StringBuilder(line8);
            str8.setLength(34);
            String gogo8 = str8.toString();
            line8 = gogo8;

            adds0[counter_1] = line0;
            adds1[counter_1] = line1;
            adds2[counter_1] = line2;
            adds3[counter_1] = line3;
            adds4[counter_1] = line4;
            adds5[counter_1] = line5;
            adds6[counter_1] = line6;
            adds7[counter_1] = line7;
            adds8[counter_1] = line8;
            
            counter++;
            counter_1++;

        }

        for (int i = 0; i <= 1222224; i++) {

            Thread thread0;
            thread0 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg0++;

                        ROWER(adds0[ggg0]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread1;
            thread1 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg1++;
                        System.out.println(gens);
                        ROWER(adds1[ggg1]);

                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };

            Thread thread2;
            thread2 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg2++;

                        ROWER(adds2[ggg2]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread3;
            thread3 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg3++;

                        ROWER(adds3[ggg3]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread4;
            thread4 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg4++;

                        ROWER(adds4[ggg4]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread5;
            thread5 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg5++;

                        ROWER(adds5[ggg5]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread6;
            thread6 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg6++;

                        ROWER(adds6[ggg6]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread7;
            thread7 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg7++;

                        ROWER(adds7[ggg7]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            Thread thread8;
            thread8 = new Thread() {

                @Override
                public void run() {

                    try {
                        long tStart = System.currentTimeMillis();
                        ggg8++;

                        ROWER(adds8[ggg8]);
                        long tEnd = System.currentTimeMillis();
                        long tDelta = tEnd - tStart;
                        double elapsedSeconds = tDelta / 1000.0;
                        System.out.println("ELAPSED TIME: " + elapsedSeconds + "Secs");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };

            thread0.start();
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            thread7.start();
            thread8.start();
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            

        }
        System.out.println("ACCOUNTS GENERATED:  #"+gens);
    }

}
