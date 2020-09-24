import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ZigZag {
  public static void main(String[] z){
    Node root = new Node(3);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(7);
    System.out.println(zigzagLevelOrder(root));
  }
  public static List<List<Integer>> zigzagLevelOrder(Node root){
    if(root == null){return new ArrayList<List<Integer>>();}
    Queue<Node> queue = new LinkedList<Node>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    queue.add(root);
    boolean reverse = false;
    while(!queue.isEmpty()){
      List<Integer> level = new ArrayList<Integer>();
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        level.add(tempHead.key);
      }
      if(!reverse){result.add(level);}
      else{
        Collections.reverse(level);
        result.add(level);
      }
      reverse = !reverse;
    }
    return result;
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
