import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class FindLargestRowVal {
  public static void main(String[] z){
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(2);
    root.left.left = new Node(5);
    root.left.right = new Node(3);
    root.right.right = new Node(9);
    System.out.println(largestValues(root));
  }
  public static List<Integer> largestValues(Node root){
    if(root == null){return new ArrayList<Integer>();}
    List<Integer> resultList = new ArrayList<Integer>();
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty()){
      int qSize = queue.size();
      int max = 0;
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        if(tempHead.key > max){max = tempHead.key;}
      }
      resultList.add(max);
    }
    return resultList;
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
