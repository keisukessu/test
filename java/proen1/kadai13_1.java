package proen1;

import java.util.Scanner;

public class kadai13_1 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("数字を入力してください");
        double x = sin.nextDouble();
        System.out.println("数字を入力してください");
        double y = sin.nextDouble();
        System.out.println(x + "+" + y + "=" + add(x, y));
        System.out.println(x + "-" + y + "=" + sub(x, y));
        System.out.println(x + "×" + y + "=" + mul(x, y));
        System.out.println(x + "÷" + y + "=" + div(x, y));
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double sub(double x, double y) {
        return x - y;
    }

    static double mul(double x, double y) {
        return x * y;
    }

    static double div(double x, double y) {
        return x / y;
    }
}