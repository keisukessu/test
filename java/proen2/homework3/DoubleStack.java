package proen2.homework3;

public class DoubleStack {
    private double[] dataArray;
    private int sp;

    public DoubleStack(int maxsize) {
        dataArray = new double[maxsize];
        sp = 0;
    }

    public boolean isFull() {
        return sp == dataArray.length;
    }

    public boolean isEmpty() {
        return sp == 0;
    }

    public int size() {
        return sp;
    }

    public void show() {
        for (int i = 0; i < sp; i++)
            System.out.println(dataArray[i]);
    }

    public void push(double value) {
        if (isFull()) {
            System.err.println("スタックは一杯です");
        } else {
            dataArray[sp] = value;
            sp++;
        }
    }

    public double pop() {
        if (isEmpty()) {
            System.err.println("スタックは空です");
            return Double.NaN;
        } else {
            sp--;
            double data = dataArray[sp];
            dataArray[sp] = 0.0;
            return data;
        }
    }

    public void clear() {
        sp = 0;
    }

    public void extend(int plus) {
        double[] dataArray2 = new double[dataArray.length + plus];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray2[i] = dataArray[i];
        }
        dataArray = dataArray2;
    }

    public void extendPush(double value) {
        if (isFull()) {
            extend(10);
            push(value);
        } else {
            push(value);
        }
    }
}
