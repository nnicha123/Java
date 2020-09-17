public class Symmetric {
  public static void main(String[] z) {
    // Tree one THIS SHOULD BE TRUE (state where if one has left null the other
    // should have right null but shouldn't be both left null or both right null)
    Node root = new Node();
    root.key = 1;
    root.left = new Node();
    root.left.key = 2;
    root.right = new Node();
    root.right.key = 2;
    // root.left.left = new Node();
    // root.left.left.key = 3;
    root.left.right = new Node();
    root.left.right.key = 3;
    root.right.left = new Node();
    root.right.left.key = 3;
    // root.right.right = new Node();
    // root.right.right.key = 3;

    printNode(root, "");
    // Use two pointers to check from leftmost+rightmost to center & see if
    // symmetrical
  }

  public static void printNode(Node root, String str) {
    if (root == null) {
      str += " ";
      return;
    }
    if (root.left == null && root.right == null) {
     str += root.key;
     System.out.println(str);
     
    }
    if (root.left == null) {
      str += "LEFTNULL";
    }
    if (root.right == null) {
      str += "RIGHTNULL";
    }
    printNode(root.left, str + root.key);
    printNode(root.right, str + root.key);
  }
}

class Node {
  int key;
  Node left;
  Node right;
}
