package proen2.homework3;

public class TestEx0307 {
    public static void main(String args[]) {
        // DoubleStackのインスタンスを生成(サイズは5で)
        DoubleStack testStack = new DoubleStack(5);
        // スタックにデータを5個追加
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        // 現在のスタックを表示
        testStack.show();
        System.out.println("格納データ数 : " + testStack.size());
        // さらにスタックに追加すると？
        testStack.extend(5);
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        System.out.println("格納データ数 : " + testStack.size());
        testStack.extendPush(2);
        System.out.println("格納データ数 : " + testStack.size());
    }

}
