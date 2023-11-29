package proen2.homework4;

public class DoubleQueue {
    private double dataArray[];
    private int rear;
    private int front;
    private int maxSize;

    public DoubleQueue(int size) {
        size++;
        this.maxSize = size;
        this.dataArray = new double[size];
        this.rear = 0;
        this.front = 0;

    }

    public int ex(int x) {
        return (x + 1) % (maxSize);
    }

    public boolean isFull() {
        return ex(rear) == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public int size() {
        if (rear >= front) {
            return rear - front;
        } else {
            return maxSize - (front - rear);
        }
    }

    public void show() {
        for (int i = front, j = 0; j < size(); i = ex(i), j++) {
            System.out.println(j + 1 + "番目:" + "Array[" + i + "]=" + dataArray[i]);
        }
    }

    /*
     * public void show() {
     * for (int i = front; count < size(); i = ex(i)) {
     * System.out.println(dataArray[i]);
     * count++;
     * }
     * 
     * }
     */
    public void enqueue(double x) {
        if (isFull()) {
            System.err.println("キューは一杯です");
        } else {
            dataArray[rear] = x;
            rear = ex(rear);

        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.err.println("キューは空です");
        } else {
            dataArray[front] = 0;
            front = ex(front);
        }
    }

}
