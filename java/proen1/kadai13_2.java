package proen1;

import java.util.Scanner;

class kadai13_2 {
    static double input_double() {
        System.out.println("数字を入力してください");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }

    public static void main(String[] args) {
        double sum = 0;
        double NUM = 0;
        for (int i = 1; i <= 3; i++) {
            NUM = input_double();
            sum += NUM;
        }
        double avr = sum / 3;
        System.out.println(avr);
    }
}