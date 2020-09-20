public class SearchTree {
  public static void main(String[] z) {
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.left = new Node(7);
    root.right.right = new Node(9);
    Node newRoot = searchBST(root, 3);
    System.out.println(newRoot.key);
    System.out.println(newRoot.left.key);
    System.out.println(newRoot.right.key);
  }

  public static Node searchBST(Node root, int val) {
    if (root == null) {
      return null;
    }
    if (root.key == val) {
      return root;
    }
    if (val < root.key) {
      return searchBST(root.left, val);
    }
    if (val > root.key) {
      return searchBST(root.right, val);
    }
    return root;
  }
}

class Node {
  int key;
  Node left;
  Node right;

  Node(int key) {
    this.key = key;
    this.left = null;
    this.right = null;
  }
}
