package proen2.homework6;

public class StudentBinTree {
    int label;
    String name;
    StudentBinTree left;// 左部分木（左の子）
    StudentBinTree right;// 右部分木（右の子）

    public StudentBinTree(int label, String name, StudentBinTree left, StudentBinTree right) {
        this.label = label;
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        StudentBinTree root = new StudentBinTree(5, "Kinugasa Natsuko",
                new StudentBinTree(2, "Jouri Haruko",
                        new StudentBinTree(1, "Ritsumei Taro", null, null),
                        new StudentBinTree(3, "Kusatsu Jiro", null, null)),
                new StudentBinTree(8, "Ibaraki Saburo", null, null));
        traversePreorder(root);
    }

    static void traversePreorder(StudentBinTree p) {
        if (p == null) {
            return;
        }
        System.out.println("label:" + p.label + " name:" + p.name);
        traversePreorder(p.left);
        traversePreorder(p.right);
    }
}
