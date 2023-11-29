package proen2.homework10;
/*
 *    プログラミング演習２
 *
 *    練習課題10-1
 *
 *    Ex1001.java
 */

public class Ex1001 {

	public static void main(String[] args) {

		double[] array = new double[10]; // 10個の要素を持つ double 型の配列を宣言

		/* 配列にデータをセット */
		array[0] = 45.5;
		array[1] = 26.7;
		array[2] = 98.5;
		array[3] = 0.5;
		array[4] = 8.94;
		array[5] = 78.4;
		array[6] = 22.3;
		array[7] = -34.5;
		array[8] = 98.54;
		array[9] = 63.4;

		/* 配列の内容をそのまま表示 */
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]:" + array[i]);
		}

		/*
		 * 練習課題10-1
		 *
		 * 以下の部分に選択ソートのアルゴリズムを記述
		 * 整列の対象は double 型の配列 array
		 */

		sort(array);

		/* ソート結果を表示 */
		System.out.println("ソート結果");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]:" + array[i]);
		}
	}

	public static void sort(double[] a) {
		int n = a.length; // 配列の要素数
		for (int i = 0; i < n - 1; i++) { // 先頭から順番に
			int lowest = i;
			double lowkey = a[i];
			for (int j = i + 1; j < n; j++) { // 未整列の中で最小値を探して
				if (a[j] < lowkey) {
					lowest = j;
					lowkey = a[j];
				}
			}
			double temp = a[i]; // 先頭と最小値を交換
			a[i] = a[lowest];
			a[lowest] = temp;
		}
	}
}
