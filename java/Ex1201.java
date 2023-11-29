/*
 *    プログラミング演習２
 *
 *    練習課題12-1
 *
 *    Ex1201.java
 */

public class Ex1201 {

	public static void main(String[] args) {

		String[] a = new String[4];
		String[] b = new String[6];
		String[] c = new String[10];

		/*
		 * 配列 a , b それぞれにソート済みのデータをセット
		 */

		a[0] = "Apple";
		a[1] = "Grape";
		a[2] = "Peach";
		a[3] = "Strawberry";

		b[0] = "Banana";
		b[1] = "Cherry";
		b[2] = "Grapefruit";
		b[3] = "Mango";
		b[4] = "Orange";
		b[5] = "Pineapple";

		/*
		 * 配列 a, b をマージする
		 */
		Ex1201.merge(a, b, c);

		/*
		 * 配列 c の中身を表示する
		 */
		for (int i = 0; i < c.length; i++) {
			System.out.println("[" + i + "]: " + c[i]);
		}

	}

	/*
	 * 練習課題12-1
	 *
	 * 以下の部分に merge メソッドを追加する
	 */

	public static void merge(String[] arrayA, String[] arrayB, String[] arrayC) {
		int aIdx = 0, bIdx = 0, cIdx = 0;
		// ⼩さいほうからマージ
		while (aIdx < arrayA.length && bIdx < arrayB.length) {
			if (arrayA[aIdx].compareTo(arrayB[bIdx]) < 0) {
				arrayC[cIdx++] = arrayA[aIdx++];
			} else {
				arrayC[cIdx++] = arrayB[bIdx++];
			}
		}
		// 残りの部分を書き出す
		while (aIdx < arrayA.length) {
			arrayC[cIdx++] = arrayA[aIdx++];
		}
		// 残りの部分を書き出す
		while (bIdx < arrayB.length) {
			arrayC[cIdx++] = arrayB[bIdx++];
		}
	}

}
