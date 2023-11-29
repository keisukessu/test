package Dai11;
public class kadai11_5{
    public static void main(String[] args){
        System.out.println("鶴と亀の頭の数の和を入力してください");
        java.util.Scanner sin = new java.util.Scanner(System.in);
        int head = sin.nextInt();
        System.out.println("鶴と亀の足の数の和を入力してください");
        java.util.Scanner cos = new java.util.Scanner(System.in);
        int leg = cos.nextInt();
        int x,y;
        x = (4*head-leg)/2;
        y = (leg-2*head)/2;
        System.out.println("鶴の頭の数は" + x);
        System.out.println("亀の頭の数は" + y);
    }
}