package proen1;

public class kadai13_3 {
    public static class Type {
        static void type(int a) {
            System.out.println("int型が引数として指定されました");
        }

        static void type(double a) {
            System.out.println("double型が引数として指定されました");
        }

        static void type(int[] a) {
            System.out.println("int型の配列が引数として指定されました");
        }

        static void type(double[] a) {
            System.out.println("double型の配列が引数として指定されました");
        }

        static void type(String a) {
            System.out.println("String型が引数として指定されました");
        }
    }

    public static void main(String[] args) {
        Type a = new Type();
        int[] array1 = { 1, 2, 3 };
        double[] array2 = { 1, 0, 2.0, 3.0 };
        a.type(1);
        a.type(1.0);
        a.type("1");
        a.type(array1);
        a.type(array2);
    }
}
