public class SumLeftLeaves {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 3;
    root.left = new Node();
    root.left.key = 9;
    root.right = new Node();
    root.right.key = 20;
    root.right.left = new Node();
    root.right.left.key = 15;
    root.right.right = new Node();
    root.right.right.key = 7;
    System.out.println(sumOfLeftLeaves(root,0,false));
  }
  public static int traversal(Node root,int sum,boolean isLeft){
    if(root == null){return 0;}
    if(root.left == null && root.right == null && isLeft){
      System.out.println(root.key);
      sum+= root.key;
    }
    return sum + traversal(root.left,sum,true) + traversal(root.right,sum,false);
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
