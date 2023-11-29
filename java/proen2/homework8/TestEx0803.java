package proen2.homework8;

/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    TestEx0803.java
 */
import java.io.*;

public class TestEx0803 {

  public static void main(String[] args) {
    StudentBinSearchTree tree = new StudentBinSearchTree();
    tree.insert(new StudentData(5, "KinugasaNatuko")); // 根ノードに学生情報を代入
    tree.insert(new StudentData(2, "Jouri Hauko"));
    tree.insert(new StudentData(1, "Ritsumei Taro"));
    tree.insert(new StudentData(3, "Kusatsu Jiro"));
    tree.insert(new StudentData(8, "Ibaraki Saburo"));

    /*
     * System.out.println("探索する値を入力してください。");
     * int i = getInt();
     * StudentNode s = tree.search(i);
     * if (s != null) {
     * System.out.println("ID" + i + "は" + s.data.name + "です。");
     * } else {
     * System.out.println("ID" + i + "は存在しません。");
     * }
     */

    tree.deleteNoChildren(8);
    tree.Order();
    /*
     * -----------------------------------------------------
     * 以下の部分にテスト用のプログラムコードを追加
     * ---------------------------------------------------
     */

  }

  // キーボードから１行読み込む
  public static String getString() {
    String s = "";
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      s = br.readLine();
    } catch (Exception e) { // 例外処理は範囲外なので無視
      System.err.println("An exception occured");
    }
    return s;
  }

  // キーボードから整数の入力を受け付ける
  public static int getInt() {
    int result = 0;
    try {
      String s = getString();
      result = Integer.parseInt(s);
    } catch (Exception e) { // 例外処理は範囲外なので無視
      System.err.println("An exception occured");
    }
    return (result);
  }
}
