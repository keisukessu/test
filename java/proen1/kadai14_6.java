package proen1;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class kadai14_6 {
    public static void main(String args[]) {
        try {
            int N = 0;
            String[] datas = null;
            List<String> lines = new ArrayList<>();
            FileInputStream in = new FileInputStream("14_6.txt");
            InputStreamReader is = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(is);
            FileWriter file = new FileWriter("reverse.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            String s;
            while ((s = br.readLine()) != null) {
                lines.add(s);
                N++;
            }
            datas = lines.toArray(new String[lines.size()]);
            for (int i = N - 1; i >= 0; i--) {
                pw.println(datas[i]);
            }
            br.close();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
