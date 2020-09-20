public class TreeHeight {
  public static void main(String[] z) {
    Node root = new Node(5);
    root.left = new Node(3);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right = new Node(8);
    root.right.left = new Node(7);
    root.right.right = new Node(9);
    System.out.println(CountHeight(root));
  }

  public static boolean isBalanced(Node root) {
    if (root == null)
      return true;
    int left = CountHeight(root.left);
    int right = CountHeight(root.right);
    if (Math.abs(left - right) > 1)
      return false;
    return isBalanced(root.left) && isBalanced(root.right);
  }

  public static int CountHeight(Node root) {
    if (root == null) {
      return 0;
    }
    int left = CountHeight(root.left);
    int right = CountHeight(root.right);
    return 1 + Math.max(left, right);
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
