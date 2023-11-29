import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex1106 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileInputStream in = new FileInputStream(args[0]);
            InputStreamReader is = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(is);
            String s;

            while ((s = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(s);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    arrayList.add(word);
                }
            }
            br.close();

        } catch (IOException e) {
        }
        String[] array = arrayList.toArray(new String[arrayList.size()]);
        long before = System.nanoTime();
        StringSort.quickSort(array);
        long after = System.nanoTime();
        long result = after - before;
        /*
         * for (int i = 0; i < array.length; i++) {
         * System.out.println("[" + i + "]:" + array[i]);
         * }
         */
        System.out.println(result + "ナノ秒");
    }
}
