package proen2.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0703 {
    public static void main(String args[]) {
        int[] data = { 1, 3, 4, 6, 7, 8, 10 };

        System.out.print("探索する値を入力してください: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int s = Arrays.binarySearch(data, key);

        if (s < 0) {
            System.out.println(key + "はdataに含まれていません");
        } else {
            System.out.println(key + "はdata[" + s + "]にあります");
        }
        scanner.close();
    }

}
