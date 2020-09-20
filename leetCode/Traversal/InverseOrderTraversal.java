import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class InverseOrderTraversal {
  public static void main(String[] z) {
    Node root = new Node(3);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(7);
    printBreadth(root);
  }

  public static List<List<Integer>> levelOrderBottom(Node root) {
    if (root == null) {
      return new ArrayList<List<Integer>>();
    }
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while (!q.isEmpty()) {
      List<Integer> level = new ArrayList<Integer>();
      int levelRounds = q.size();
      for (int i = 0; i < levelRounds; i++) {
        Node tempHead = q.poll();
        if (tempHead.left != null) {
          q.add(tempHead.left);
        }
        if (tempHead.right != null) {
          q.add(tempHead.right);
        }
        level.add(tempHead.val);
      }
      result.add(level);

    }
    Collections.reverse(result);
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
      System.out.println(tempHead.val);
    }
  }
}

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}
