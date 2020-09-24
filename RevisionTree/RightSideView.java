import java.util.*;

public class RightSideView {
  public static void main(String[] z) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.right = new Node(5);
    root.right.right = new Node(4);
    System.out.println(rightSideView(root));
  }

  public static List<Integer> rightSideView(Node root) {
    if (root == null) {
      return new ArrayList<Integer>();
    }
    Queue<Node> queue = new LinkedList<Node>();
    List<Integer> result = new ArrayList<Integer>();
    queue.add(root);
    int lastTempHead = root.key;
    while (!queue.isEmpty()) {
      int qSize = queue.size();
      for (int i = 0; i < qSize; i++) {
        Node tempHead = queue.poll();
        if (tempHead.left != null) {
          queue.add(tempHead.left);
        }
        if (tempHead.right != null) {
          queue.add(tempHead.right);
        }
        lastTempHead = tempHead.key;
      }
      result.add(lastTempHead);
    }
    return result;
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
