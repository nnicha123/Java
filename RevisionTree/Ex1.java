import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void main(String[] z){
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(8);
    root.left.left = new Node(2);
    root.right.left = new Node(7);
    root.right.right = new Node(9);
    printBreadth(root);
    System.out.println(returnLevel(root));
    System.out.println(sumLevel(root));
    System.out.println(maxLevelSum(root));
  }
  public static int maxLevelSum(Node root){
    if(root == null){return 0;}
    Queue<Node> queue = new LinkedList<Node>();
    
    int maxSum = 0;
    queue.add(root);
    while(!queue.isEmpty()){
      int queueSize = queue.size();
      int levelSum = 0;
      for(int i=0;i<queueSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        levelSum += tempHead.key;
      }
      if(levelSum > maxSum){maxSum = levelSum;}
    }
    return maxSum;
  }
  public static List<Integer> sumLevel(Node root){
    if(root == null){return new ArrayList<Integer>();}
    Queue<Node> queue = new LinkedList<Node>();
    List<Integer> allSum = new ArrayList<Integer>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      int levelSum = 0;
      for(int i=0;i<size;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        levelSum += tempHead.key;
      }
      allSum.add(levelSum);
    } 
    return allSum;
  }
  public static List<List<Integer>> returnLevel(Node root){
    if(root == null){return new ArrayList<List<Integer>>();}
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    while(!queue.isEmpty()){
      int qSize = queue.size();
      List<Integer> level = new ArrayList<Integer>();
      for(int i=0;i<qSize;i++){
        Node tempHead = queue.poll();
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
        level.add(tempHead.key);
      }
      result.add(level);
    }
    return result;
  }
  public static void printBreadth(Node root){
    if(root == null){return;}
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while(!q.isEmpty()){
      Node tempHead = q.poll();
      if(tempHead.left != null){q.add(tempHead.left);}
      if(tempHead.right != null){q.add(tempHead.right);}
      System.out.println(tempHead.key);
    }
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
