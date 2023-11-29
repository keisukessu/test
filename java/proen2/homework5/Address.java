package proen2.homework5;

public class Address // extends AddressData
{
    private Cell header; // リストの最初のリンクを指す
    private int size;

    public Address() {
        // super("name", "kana", "phone", "mail"); // コンストラクタ
        header = null; // 初期状態ではリストにCellはない
        size = 0;
    }

    public boolean isEmpty() { // リストが空かどうかを判定
        return (header == null);
    }

    public void insertFirst(AddressData d) {
        Cell p = new Cell(d);
        p.next = header;
        header = p;
        size++;
    }

    public AddressData deleteFirst() {
        if (isEmpty()) {
            System.err.println("空です");
            return null;
        } else {
            Cell p = header;
            header = header.next;
            size--;
            return p.data;
        }
    }

    public void displayList() {
        Cell current = header; // リストの先頭からスタート
        while (current != null) { // リストの末尾まで
            // データを表示
            current.data.print();
            System.out.println();
            current = current.next; // 次のリンクへ進む
        }
    }

    public AddressData getAddressData(int position) {
        // position がリストの範囲内かどうかを判定（sizeを利用）
        if ((position <= 0) || (position > size)) {
            return (null);
        }
        Cell current = header; // current が先頭を指すように
        // position まで要素を順番に移動する
        for (int count = 1; count < position; count++) {
            current = current.next;
        }
        return (current.data);
    }

    public boolean insert(AddressData d, int position) {
        Cell p = new Cell(d);
        if (position <= 0 || position > size + 1) {
            return false; // 挿入位置が無効な場合は false を返す
        }
        if (position == 1) {
            insertFirst(d);
        } else {
            Cell current = header;
            int count = 1;

            while (count < position - 1) {
                current = current.next;
                count++;
            }

            p.next = current.next;
            current.next = p;
            size++;
        }
        return true;
    }

    public AddressData delete(int position) {
        if (position == 1) {
            deleteFirst();
        }
        if (position <= 0 || position > size) {
            return null;
        } else {
            Cell current = header;
            Cell pre = null;

            // positionまで要素を順番に移動する
            for (int count = 1; count < position; count++) {
                pre = current;
                current = current.next;
            }

            // currentが削除対象の要素を指している
            pre.next = current.next;
            size--;

            return current.data;
        }
    }
}
