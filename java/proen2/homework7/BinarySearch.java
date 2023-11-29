package proen2.homework7;

import java.util.Scanner;

class BinarySearch {
    static int search(int[] data, int key) {
        int low = 0;
        int high = data.length;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (key == data[middle]) {
                return middle;
            } else if (key < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
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