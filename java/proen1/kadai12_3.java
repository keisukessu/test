package proen1;

class kadai12_3 {
    public static void main(String[] args) {
        double a = 9;
        int sum = 0;
        do {
            a = a / 2;
            sum++;
        } while (a > 0.003);
        System.out.println(sum);
    }
}