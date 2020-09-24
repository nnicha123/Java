import java.util.*;
public class PathSumTwo{
  public static void main(String[] z){
    Node root = new Node(5);
    root.left = new Node(4);
    root.right = new Node(8);
    root.left.left = new Node(11);
    root.left.left.left = new Node(7);
    root.left.left.right = new Node(2);
    root.right.left = new Node(13);
    root.right.right = new Node(4);
    root.right.right.left = new Node(5);
    root.right.right.right = new Node(1);
    // List<List<Integer>> resultList = new ArrayList<>();
    System.out.println(pathSum(root,22));

  }
  public static List<List<Integer>> pathSum(Node root, int sum){
    if(root == null){return new ArrayList<List<Integer>>();}
    List<List<Integer>> result = new ArrayList<>();
    levelSum(root,sum,result,new ArrayList<Integer>());
    return result;
  }
  public static void levelSum(Node root,int sum, List<List<Integer>> result,List<Integer> level){
    if(root == null){return;}
    sum -= root.key;
    level.add(root.key);
    if(sum == 0 && root.left == null && root.right == null){
      result.add(new ArrayList<>(level));
    }
    levelSum(root.left,sum,result,level);
    levelSum(root.right,sum,result,level);
    level.remove(level.size() -1);
    // System.out.println(result);
  }
  public static void printDepth(Node root,int sum){
    if(root == null){return;}
    if(root.left == null && root.right == null){
      System.out.println(sum+root.key);
    }
    printDepth(root.left,sum+root.key);
    printDepth(root.right,sum+root.key);

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