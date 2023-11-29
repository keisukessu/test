package proen2.homework8;
/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    StudentBinSearchTree.java
 *
 *    雛形：学生の情報を対象とした二分探索木
 */

public class StudentBinSearchTree {

  private StudentNode root; // 二分探索木の根

  /*
   * 空の二分探索木を作成
   */
  public StudentBinSearchTree() {
    this.root = null;
  }

  /*
   * -------------------------------------------------------
   * 必要に応じて以降にプログラムコードを追加する
   * -----------------------------------------------------
   */
  public StudentNode search(int id) {
    StudentNode p = root;
    StudentData a = new StudentData(id, null);
    // StudentNode d = new StudentNode(a);
    while (p != null) {
      int result = a.compareTo(p.data);
      if (result == 0) {
        return p;
      } else if (result < 0) {
        p = p.left;
      } else {
        p = p.right;
      }

    }
    return null;
  }

  public StudentNode insert(StudentData target) {
    StudentNode p = root;
    StudentNode parent = null;
    boolean isLeftChild = false;

    while (p != null) {
      int result = target.compareTo(p.data);
      if (result == 0) {
        return null;
      } else if (result < 0) {
        parent = p;
        isLeftChild = true;
        p = p.left;
      } else {
        parent = p;
        isLeftChild = false;
        p = p.right;
      }
    }
    StudentNode newNode = new StudentNode(target);
    if (parent == null) {
      root = newNode;
    } else if (isLeftChild) {
      parent.left = newNode;
    } else {
      parent.right = newNode;
    }
    return newNode;

  }

  public boolean deleteNoChildren(int id) {
    StudentNode p = root;
    StudentNode parent = null;
    boolean isLeftChild = false;
    StudentData a = new StudentData(id, null);
    while (p != null) {
      int result = a.compareTo(p.data);
      if (result == 0) {
        if (p.left == null && p.right == null) {
          if (parent == null) {
            root = null;
          } else if (isLeftChild) {
            parent.left = null;
          } else {
            parent.right = null;
          }
          return true;
        }
      } else if (result < 0) {
        parent = p;
        isLeftChild = true;
        p = p.left;
      } else {
        parent = p;
        isLeftChild = false;
        p = p.right;
      }
    }
    return false;
  }

  public void Order() {
    Order(root);
  }

  static void Order(StudentNode node) {
    if (node != null) {
      Order(node.left);
      System.out.println("ID: " + node.data.id);
      System.out.println("Name: " + node.data.name);
      Order(node.right);
    }
  }
}
