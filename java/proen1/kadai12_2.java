package proen1;

class kadai12_2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int d = a; d <= b; d++) {
            System.out.println(d + "の段");
            for (int i = 1; i < 10; i++) {
                System.out.println(d + " * " + i + " = " + d * i);
            }
        }
    }
}