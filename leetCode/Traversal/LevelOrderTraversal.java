import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversal {
  public static void main(String[] z) {
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.left.right = new Node(4);
    root.right.left = new Node(7);
    root.right.right = new Node(9);
    printBreadth(root);
  }

  public static List<List<Integer>> levelOrder(Node root) {
    if (root == null) {
      return new ArrayList<List<Integer>>();
    }
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    while (!q.isEmpty()) {
      int levelLoop = q.size();
      List<Integer> level = new ArrayList<Integer>();
      for (int i = 0; i < levelLoop; i++) {
        Node tempHead = q.poll();
        if (tempHead.left != null) {
          q.add(tempHead.left);
        }
        if (tempHead.right != null) {
          q.add(tempHead.right);
        }
        level.add(tempHead.key);
      }
      result.add(level);
    }
    return result;
  }

  public static void printBreadth(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while (!q.isEmpty()) {
      Node tempHead = q.poll();
      if (tempHead.left != null) {
        q.add(tempHead.left);
      }
      if (tempHead.right != null) {
        q.add(tempHead.right);
      }
      System.out.println(tempHead.key);
    }
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
