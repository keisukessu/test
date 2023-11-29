package proen2.homework3;

public class TestEx0305 {
    public static void main(String args[]) {
        // DoubleStackのインスタンスを生成(サイズは5で)
        DoubleStack testStack = new DoubleStack(5);
        // スタックにデータを5個追加
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        // 空になるまでポップする
        int count = 0;
        while (!testStack.isEmpty()) {
            System.out.println(count + " : " + testStack.pop());
            count++;
        }
        // スタックが空でDouble.NaNが返れば正解
        System.out.println("さらにpop : " + testStack.pop());
    }

}
