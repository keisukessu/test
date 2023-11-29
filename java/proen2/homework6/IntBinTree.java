package proen2.homework6;

public class IntBinTree {
    int label;
    IntBinTree left;// 左部分木（左の子）
    IntBinTree right;// 右部分木（右の子）

    public IntBinTree(int label, IntBinTree left, IntBinTree right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        IntBinTree Lnode = new IntBinTree(1, null, null);
        IntBinTree Rnode = new IntBinTree(3, null, null);
        IntBinTree root = new IntBinTree(2, Lnode, Rnode);
        System.out.println("行きがけ順のなぞり");
        traversePreorder(root);
    }

    static void traversePreorder(IntBinTree p) {
        if (p == null) {
            return;
        }
        System.out.println("節" + p.label + "に立ち寄りました");
        traversePreorder(p.left);
        traversePreorder(p.right);
    }
}
