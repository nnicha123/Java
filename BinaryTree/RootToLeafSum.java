public class RootToLeafSum {
  public static void main(String[] z) {
    Node root = new Node();
    root.key = 5;
    root.left = new Node();
    root.left.key = 4;
    root.right = new Node();
    root.right.key = 8;
    root.left.left = new Node();
    root.left.left.key = 11;
    root.right.left = new Node();
    root.right.left.key = 13;
    root.right.right = new Node();
    root.right.right.key = 4;
    root.left.left.left = new Node();
    root.left.left.left.key = 7;
    root.left.left.right = new Node();
    root.left.left.right.key = 2;
    root.right.right.right = new Node();
    root.right.right.right.key = 1;
    // pathSum(root, 0);

    System.out.println(hasPathSum(root, 22));
    // System.out.println(rootToLeaf(root, 0));
  }

  public static int rootToLeaf(Node r, int current) {
    if (r == null) {
      return 0;
    }
    int a = rootToLeaf(r.left, current + r.key);
    int b = rootToLeaf(r.right, current + r.key);
    return r.key + Math.max(a, b);
  }

  public static boolean hasPathSum(Node root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left == null && root.right == null) {
      if (sum - root.key == 0) {
        return true;
      }
    }
    boolean left = hasPathSum(root.left, sum - root.key);
    boolean right = hasPathSum(root.right, sum - root.key);
    return false || left || right;
  }

  public static void pathSum(Node root, int current) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      System.out.println(current + root.key);
    } else {
      pathSum(root.left, current + root.key);
      pathSum(root.right, current + root.key);
    }
  }
}

class Node {
  int key;
  Node left;
  Node right;
}
