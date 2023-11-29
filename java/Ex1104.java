import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex1104 {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream(args[0]);
            InputStreamReader is = new InputStreamReader(in, "UTF-8");
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
