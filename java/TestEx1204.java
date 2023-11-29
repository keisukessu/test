/*
 *    プログラミング演習２
 *
 *    第12週動作テスト用プログラム
 *
 *    TestEx1204.java
 */

public class TestEx1204 {

	public static void main(String[] args) {

		String[] data = new String[10] ;

		/*
		 * 配列 data に未ソートのデータをセット
		 */

		data[0] = "Mango" ;
		data[1] = "Strawberry" ;
		data[2] = "Peach" ;
		data[3] = "Pineapple" ;
		data[4] = "Orange" ;
		data[5] = "Banana" ;
		data[6] = "Grape" ;
		data[7] = "Apple" ;
		data[8] = "Cherry" ;
		data[9] = "Grapefruit" ;

		/*
		 * 配列 data のをマージソートする
		 */
		StringSort.mergeSort(data) ;

		/*
		 * 配列 data の中身を表示する
		 */
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println("[" + i + "]: " + data[i]) ;
		}

	}

}
