import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class FindBottomLeft {
  public static void main(String[] z){
    Node root = new Node(2);
    root.left = new Node(1);
    root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.right.left = new Node(5);
    // root.right.right = new Node(6);
    // root.right.left.left = new Node(7);
    // printBreadth(root);
    System.out.println(findBottomLeftValue(root));
  }
  public static int findBottomLeftValue(Node root){
    if(root == null){return 0;}
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    int result = root.key;
    while(!queue.isEmpty()){ 
      List<Integer> level = new ArrayList<Integer>();
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        level.add(tempHead.key);
      }
      // System.out.println(level);
      result = level.get(0);
    }
    return result;
  }
  public static void printBreadth(Node root){
    if(root == null){return;}
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    
    while(!queue.isEmpty()){
      List<Integer> level = new ArrayList<Integer>();
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        level.add(tempHead.key);
      }
      System.out.println(level);
    }
    return;
  }
}
class Node{
  int key;
  Node left;
  Node right;
  Node(int key){
    this.key = key;
    this.left = null;
    this.right = null;
  }
}