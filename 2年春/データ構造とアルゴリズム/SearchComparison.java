import java.util.Random ;
import java.util.Arrays ;

public class SearchComparison {

  public static void main(String[] args) {
    
    int num = 10000000 ;
    int[] data = new int[num] ;
    
    /* num の数だけ乱数を発生させて配列 data に格納 */
    Random rnd = new Random() ;
    for (int i = 0 ; i < data.length ; i++) {
      data[i] = rnd.nextInt(num) ;
    }
    
    /*
    // 乱数の発生状況を確認する場合はここのコメントをはずす
    for (int i = 0 ; i < data.length ; i++) {
      System.out.print(data[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    /* 配列dataのコピーを作成 */
    int[] data_copy = Arrays.copyOf(data, data.length) ;
    
    /*
    // コピーの中身を確認するときはここのコメントをはずす
    for (int i = 0 ; i < data_copy.length ; i++) {
      System.out.print(data_copy[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    /* 二分探索のためにdata_copyを整列 */
    long s_sort = System.nanoTime() ;
    Arrays.sort(data_copy) ; 
    long e_sort = System.nanoTime() ;
    
    
    /*
    // 整列後の中身を確認するときはここのコメントをはずす
    for (int i = 0 ; i < data_copy.length ; i++) {
      System.out.print(data_copy[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    // 0～num 未満の乱数を key に設定
    int key = rnd.nextInt(num) ;
    System.out.println("Key : " + key) ;
    // 線形探索
    long s_linear = System.nanoTime() ;
    int idx_l = linearSearch(key, data) ;
    long e_linear = System.nanoTime() ;
    System.out.println("Keyの格納された場所 : " + idx_l) ;
    if (idx_l != -1) {
      System.out.println("Keyの値と一致するかを確認 : " + data[idx_l]) ;
    }
    
    long s_binary = System.nanoTime() ;
    int idx_b = binarySearch(key, data_copy) ;
    long e_binary = System.nanoTime() ;
    System.out.println("Keyの格納された場所 : " + idx_b) ;
    if (idx_b != -1) {
      System.out.println("Keyの値と一致するかを確認 : " + data_copy[idx_b]) ;
    }    
    /* 処理時間を表示 */
    System.out.println("線形探索の処理時間 : " + (e_linear - s_linear) / 1000000f + " [ms]") ;
    System.out.println("二分探索の処理時間 : " + (e_binary - s_binary) / 1000000f + " [ms]") ;
    System.out.println("整列の処理時間 : " + (e_sort - s_sort) / 1000000f + " [ms]") ;
  }
  
  /* key に合致する配列の添字を返す */
  public static int linearSearch(int key, int[] table) {
    int i = 0;                    // (1)
    while (i < table.length) {               // (2)
      if (table[i] == key)    // (3)
        return (i);               // (4) 見つかった
      i++;                        // (5)
    } 
    return (-1);                  // (6) 見つからなかった
  }

  /* key に合致する配列の添字を返す */
  public static int binarySearch(int key, int[] table) {
    int low = 0;                         // (1)
    int high = table.length - 1;                    // (2)
    while (low <= high) {                // (3)
      int middle = (low + high) / 2;     // (4)
      if (key == table[middle])      // (5)
        return middle;                   // (6) 見つかった
      else if (key < table[middle])  // (7)
        high = middle - 1;               // (8)
      else  // key > table[middle] である
        low = middle + 1;                // (9)
    }
    return (-1) ;                        // (10) 見つからなかった
  }
}
