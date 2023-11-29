package proen2.homework7;

import java.util.Scanner;

class LinearSearch {
    static int search(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] data = { 1, 3, 4, 6, 7, 8, 10 };
        System.out.print("探索する値を入力してください: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int s = search(data, key);
        if (s == -1) {
            System.out.println(key + "はdataに含まれていません");
        } else {
            System.out.println(key + "はdata[" + s + "]にあります");
        }
        scanner.close();
    }
}