package proen2.homework10;
/*
 *    プログラミング演習２
 *
 *    第10週　動作テスト用プログラム
 *
 *    TestEx1005.java
 */

public class TestEx1005 {

    public static void main(String[] args) {

        String[] array = new String[10]; // 10個の要素を持つ String クラスの配列を宣言

        /* 配列にデータをセット */
        array[0] = "Orange";
        array[1] = "Banana";
        array[2] = "Apple";
        array[3] = "Grape";
        array[4] = "Pineapple";
        array[5] = "Peach";
        array[6] = "Strawberry";
        array[7] = "Cherry";
        array[8] = "Mango";
        array[9] = "Grapefruit";

        /* 配列の内容をそのまま表示 */
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]:" + array[i]);
        }

        /* StringSort クラスの selectionSort メソッドを呼び出す */
        StringSort.insertSort(array);

        /* ソート結果を表示 */
        System.out.println("ソート結果");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]:" + array[i]);
        }

    }
}
