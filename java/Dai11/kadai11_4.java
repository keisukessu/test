package Dai11;
/*kadai11_4.java*/
import java.util.Scanner;
class kadai11_4{
    public static void main(String[] args) {
     System.out.println("名前をローマ字で入力してください");
     java.util.Scanner sin = new java.util.Scanner(System.in);
     String name = sin.next(); /*nextInt() メソッドで int 型に */
     System.out.println("名前は" + name + "です。");
     System.out.println(name + "の長さは" + name.length());
     }
}