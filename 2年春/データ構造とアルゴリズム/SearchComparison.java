import java.util.Random ;
import java.util.Arrays ;

public class SearchComparison {

  public static void main(String[] args) {
    
    int num = 10000000 ;
    int[] data = new int[num] ;
    
    /* num �̐����������𔭐������Ĕz�� data �Ɋi�[ */
    Random rnd = new Random() ;
    for (int i = 0 ; i < data.length ; i++) {
      data[i] = rnd.nextInt(num) ;
    }
    
    /*
    // �����̔����󋵂��m�F����ꍇ�͂����̃R�����g���͂���
    for (int i = 0 ; i < data.length ; i++) {
      System.out.print(data[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    /* �z��data�̃R�s�[���쐬 */
    int[] data_copy = Arrays.copyOf(data, data.length) ;
    
    /*
    // �R�s�[�̒��g���m�F����Ƃ��͂����̃R�����g���͂���
    for (int i = 0 ; i < data_copy.length ; i++) {
      System.out.print(data_copy[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    /* �񕪒T���̂��߂�data_copy�𐮗� */
    long s_sort = System.nanoTime() ;
    Arrays.sort(data_copy) ; 
    long e_sort = System.nanoTime() ;
    
    
    /*
    // �����̒��g���m�F����Ƃ��͂����̃R�����g���͂���
    for (int i = 0 ; i < data_copy.length ; i++) {
      System.out.print(data_copy[i] + ", ") ;
    }
    System.out.println() ;
    */
    
    // 0�`num �����̗����� key �ɐݒ�
    int key = rnd.nextInt(num) ;
    System.out.println("Key : " + key) ;
    // ���`�T��
    long s_linear = System.nanoTime() ;
    int idx_l = linearSearch(key, data) ;
    long e_linear = System.nanoTime() ;
    System.out.println("Key�̊i�[���ꂽ�ꏊ : " + idx_l) ;
    if (idx_l != -1) {
      System.out.println("Key�̒l�ƈ�v���邩���m�F : " + data[idx_l]) ;
    }
    
    long s_binary = System.nanoTime() ;
    int idx_b = binarySearch(key, data_copy) ;
    long e_binary = System.nanoTime() ;
    System.out.println("Key�̊i�[���ꂽ�ꏊ : " + idx_b) ;
    if (idx_b != -1) {
      System.out.println("Key�̒l�ƈ�v���邩���m�F : " + data_copy[idx_b]) ;
    }    
    /* �������Ԃ�\�� */
    System.out.println("���`�T���̏������� : " + (e_linear - s_linear) / 1000000f + " [ms]") ;
    System.out.println("�񕪒T���̏������� : " + (e_binary - s_binary) / 1000000f + " [ms]") ;
    System.out.println("����̏������� : " + (e_sort - s_sort) / 1000000f + " [ms]") ;
  }
  
  /* key �ɍ��v����z��̓Y����Ԃ� */
  public static int linearSearch(int key, int[] table) {
    int i = 0;                    // (1)
    while (i < table.length) {               // (2)
      if (table[i] == key)    // (3)
        return (i);               // (4) ��������
      i++;                        // (5)
    } 
    return (-1);                  // (6) ������Ȃ�����
  }

  /* key �ɍ��v����z��̓Y����Ԃ� */
  public static int binarySearch(int key, int[] table) {
    int low = 0;                         // (1)
    int high = table.length - 1;                    // (2)
    while (low <= high) {                // (3)
      int middle = (low + high) / 2;     // (4)
      if (key == table[middle])      // (5)
        return middle;                   // (6) ��������
      else if (key < table[middle])  // (7)
        high = middle - 1;               // (8)
      else  // key > table[middle] �ł���
        low = middle + 1;                // (9)
    }
    return (-1) ;                        // (10) ������Ȃ�����
  }
}
