package proen1;

class kadai12_5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}