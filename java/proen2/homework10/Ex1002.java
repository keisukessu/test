package proen2.homework10;
/*
 *    プログラミング演習２
 *
 *    練習課題10-2
 *
 *    Ex1002.java
 */

public class Ex1002 {

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

		/*
		 * 練習課題10-2
		 *
		 * 以下の部分に選択ソートのアルゴリズムを記述
		 * 整列の対象は String クラスの配列 array
		 */
		sort(array);
		/* ソート結果を表示 */
		System.out.println("ソート結果");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]:" + array[i]);
		}

	}

	public static void sort(String[] a) {
		int n = a.length; // 配列の要素数
		for (int i = 0; i < n - 1; i++) { // 先頭から順番に
			int lowest = i;
			String lowkey = a[i];
			for (int j = i + 1; j < n; j++) { // 未整列の中で最小値を探して
				if (a[j].compareTo(lowkey) < 0) {
					lowest = j;
					lowkey = a[j];
				}
			}
			String temp = a[i]; // 先頭と最小値を交換
			a[i] = a[lowest];
			a[lowest] = temp;
		}
	}

}
