package proen2.homework4;

public class TestEx0404 {
    public static void main(String args[]) {
        // DoubleQueueのインスタンスを生成(サイズは5で)
        DoubleQueue testQueue = new DoubleQueue(5);
        // 待ち行列にデータを5個追加
        for (int i = 0; i < 5; i++) {
            testQueue.enqueue(i * 0.5 + 1);
        }
        // 現在の待ち行列を表示
        testQueue.show();
        System.out.println("格納データ数 : " + testQueue.size());
        // さらにデータを追加すると
        testQueue.enqueue(5);
        System.out.println("格納データ数 : " + testQueue.size());
    }

}
