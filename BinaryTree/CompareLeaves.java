public class CompareLeaves {
  public static void main(String[] z) {
    // Tree 1
    Node root = new Node();
    root.key = 3;
    root.left = new Node();
    root.left.key = 5;
    root.right = new Node();
    root.right.key = 1;
    root.left.left = new Node();
    root.left.left.key = 6;
    root.left.right = new Node();
    root.left.right.key = 2;
    root.left.right.left = new Node();
    root.left.right.left.key = 7;
    root.left.right.right = new Node();
    root.left.right.right.key = 14;
    root.right.left = new Node();
    root.right.left.key = 9;
    root.right.right = new Node();
    root.right.right.key = 8;

    // Tree 2
    Node r2 = new Node();
    r2.key = 3;
    r2.left = new Node();
    r2.left.key = 5;
    r2.left.left = new Node();
    r2.left.left.key = 6;
    r2.left.right = new Node();
    r2.left.right.key = 71;
    r2.right = new Node();
    r2.right.key = 1;
    r2.right.left = new Node();
    r2.right.left.key = 4;
    r2.right.right = new Node();
    r2.right.right.key = 2;
    r2.right.right.left = new Node();
    r2.right.right.left.key = 9;
    r2.right.right.right = new Node();
    r2.right.right.right.key = 8;

    System.out.println(printLeaves(root, ""));
    System.out.println(printLeaves(r2, ""));
    System.out.println(leafSimilar(root, r2));
  }

  public static boolean leafSimilar(Node root1, Node root2) {
    return printLeaves(root1, "").equals(printLeaves(root2, ""));
  }

  public static String printLeaves(Node root, String str) {
    if (root == null) {
      return "";
    }
    if (root.left == null && root.right == null) {
      str += root.key;
    }
    return str + printLeaves(root.left, str) + printLeaves(root.right, str);
  }
}

class Node {
  int key;
  Node left;
  Node right;

}