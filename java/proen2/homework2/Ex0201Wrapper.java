public class Ex0201Wrapper {
    public static void main(String[] args) {
        /*
         * Integer sum = new Integer(0) ;
         * これだとIntegerオブジェクトがループのたびに作成されメモリを消費する
         */
        int sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sum = sum + 1;
        }
        System.out.println("処理結果：" + sum);
        long end = System.currentTimeMillis();
        System.out.println("処理時間：" + (end - start) + " [ms]");
    }
}