package proen1;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileTest {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("input.txt");
            InputStreamReader is = new InputStreamReader(in, "Shift_JIS");
            BufferedReader br = new BufferedReader(is);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
        }
    }
}