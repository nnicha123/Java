import java.util.LinkedList;
import java.util.Queue;
public class MaximumDepth {
  public static void main(String[] z){
    Node root = new Node(1);
    root.left = new Node(3);
    root.left.left = new Node(6);
    root.left.right = new Node(7);
    root.left.right.right = new Node(11);
    root.left.right.right.right = new Node(14);
    root.right = new Node(4);
    root.right.right = new Node(8);
    System.out.println(maxDepth(root));
  }
  public static int maxDepth(Node root){
    if(root == null){return 0;}
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    int depth = 0;
    while(!queue.isEmpty()){
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
      }
      depth++;
    }
    return depth;
  }
}
class Node{
  int key;
  Node left;
  Node right;
  Node(int key){
    this.key = key;
  }
}
