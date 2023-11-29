package proen1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class kadai14_5 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("test.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            for (int i = 0; i < args.length; i++) {
                pw.print(args[i]);
                pw.print(" ");
            }
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
