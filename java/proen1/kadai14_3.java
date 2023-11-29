package proen1;

public class kadai14_3 {
    public static void main(String[] args) {
        try {
            char[] str = "ABCDEFG".toCharArray();

            int a = Integer.parseInt(args[0]);
            System.out.println(str[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Number is out of range");

        }

    }
}
