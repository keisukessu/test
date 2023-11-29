package proen2.homework10;
/*
 *    プログラミング演習２
 *
 *    整列の課題のひな型
 *
 *    StringSort.java
 */

public class StringSort {

	private StringSort() { // StringSortクラスのオブジェクトを作成できないようにする
	}

	public static void selectionSort(String[] targetArray) {

		System.out.println("====[ Selection Sort ]====");

		int n = targetArray.length; // 配列の要素数
		for (int i = 0; i < n - 1; i++) { // 先頭から順番に
			int lowest = i;
			String lowkey = targetArray[i];
			for (int j = i + 1; j < n; j++) { // 未整列の中で最小値を探して
				if (targetArray[j].compareTo(lowkey) < 0) {
					lowest = j;
					lowkey = targetArray[j];
				}
			}
			String temp = targetArray[i]; // 先頭と最小値を交換
			targetArray[i] = targetArray[lowest];
			targetArray[lowest] = temp;
		}
	}

	public static void bubbleSort(String[] targetArray) {
		System.out.println("====[ Bubble Sort ]====");
		int n = targetArray.length; // 配列の要素数
		for (int i = 0; i < n - 1; i++) { // 外側のループ
			for (int j = n - 1; j > i; j--) { // 配列の後ろから先頭へ
				if (targetArray[j].compareTo(targetArray[j - 1]) < 0) { // 隣同士を比較して
					String temp = targetArray[j]; // 後ろ側が大きくなるように
					targetArray[j] = targetArray[j - 1]; // 必要ならば交換
					targetArray[j - 1] = temp;
				}
			}
		}
	}

	public static void insertSort(String[] targetArray) {
		System.out.println("====[ Insert Sort ]====");
		int n = targetArray.length; // 配列の要素数
		for (int i = 1; i < n; i++) {
			String temp = targetArray[i]; // 移動対象をいったん退避
			int j = i;
			while (j >= 1 && temp.compareTo(targetArray[j - 1]) <= 0) { // 移動対象以上のものを
				targetArray[j] = targetArray[j - 1]; // 1つずつずらしていく
				j--;
			}
			targetArray[j] = temp;
		}
	}

	private static int partition(String[] targetArray, int left, int right) {
		int i = left - 1; // i を初期化
		int j = right; // j を初期化
		String pivot = targetArray[right]; // 枢軸を右端の要素に設定
		while (true) { // i と j がぶつかるまで繰り返す
			while (targetArray[++i].compareTo(pivot) < 0) // 右端に pivot があるので必ず脱出できる
				; // NOP 何もしない．ただ探しているだけ
			while (i < --j && pivot.compareTo(targetArray[j]) < 0) // いつかは i にぶつかる
				; // NOP 何もしない．ただ探しているだけ
			if (i >= j)
				break; // ぶつかったら終わり．ループを抜ける
			String temp = targetArray[i]; // ぶつかっていないので i と j の指す要素を交換
			targetArray[i] = targetArray[j];
			targetArray[j] = temp;
		}
		String temp = targetArray[i]; // targetArray[i] と枢軸を交換
		targetArray[i] = targetArray[right];
		targetArray[right] = temp;
		return i;
	}

	public static void main(String[] arg) {
		String[] array = new String[10];
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
		int idx = partition(array, 0, arg.length - 1);
		System.out.println("分割後枢軸のidx:" + idx);
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]:" + array[i]);
		}
	}

	private static void recQuickSort(String[] targetArray, int left, int right) {
		if (left >= right) // 整列する要素が1つなら何もしないで戻る
			return;
		int v = partition(targetArray, left, right); // 枢軸targetArray[v]を基準に分割
		recQuickSort(targetArray, left, v - 1); // 左部分配列targetArray[left]～targetArray[v-1]を整列
		recQuickSort(targetArray, v + 1, right); // 右部分配列targetArray[v+1]～targetArray[r]を整列
	}

	public static void quickSort(String[] targetArray) {
		recQuickSort(targetArray, 0, targetArray.length - 1); // recQuickSortを呼び出して整列
	}
}
