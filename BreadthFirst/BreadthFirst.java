import java.util.Queue;
import java.util.LinkedList;
public class BreadthFirst {
  public static void main(String[] z){
    // Symmetric;
    Node root = new Node();
    root.key = 1;
    root.left = new Node();
    root.left.key = 2;
    root.left.left = new Node();
    root.left.left.key = 3;
    root.left.right = new Node();
    root.left.right.key = 3;
    root.left.left.left = new Node();
    root.left.left.left.key = 4;
    root.left.right.right = new Node();
    root.left.right.right.key = 4;
    root.right = new Node();
    root.right.key = 2;
    root.right.left = new Node();
    root.right.left.key = 3;
    root.right.right = new Node();
    root.right.right.key = 3;
    root.right.left.left = new Node();
    root.right.left.left.key = 4;
    root.right.right.right = new Node();
    root.right.right.right.key = 4;
    System.out.println("Breadth First Search");
    printBreadth(root);
    System.out.println();
    System.out.println("Depth First Search");
    printDepth(root);
  }
  public static void printBreadth(Node root){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty()){
      Node tempHead = queue.poll();
      System.out.print(tempHead.key + " ");
      if(tempHead.left != null){queue.add(tempHead.left);}
      if(tempHead.right != null){queue.add(tempHead.right);}
    }
  }
  public static void printDepth(Node root){
    if(root == null){return;}
    System.out.print(root.key + " ");
    printDepth(root.left);
    printDepth(root.right);
  }
  // Check Symmetry => If left and right don't have the same number
  // using depth first search then it is not symmetrical
}
class Node{
  int key;
  Node left;
  Node right;
}
