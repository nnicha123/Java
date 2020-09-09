import java.util.*;
class Example{
  public static void main(String[] z){
    Node root = new Node();
    root.key = 5;
    root.left = new Node();
    root.left.key = 4;
    root.left.left = new Node();
    root.left.left.key = 7;
    root.left.left.left = new Node();
    root.left.left.left.key = 2;

    root.right = new Node();
    root.right.key = 2;
    root.right.left = new Node();
    root.right.left.key = 9;
    root.right.right = new Node();
    root.right.right.key = 3;
    root.right.left.right = new Node();
    root.right.left.right.key = 8;
    System.out.println(count(root));
    countLayer(root);
  }
  public static int count(Node r){
    if( r == null ) return 0; 
    return count(r.left) + count(r.right) + 1;
  }
  public static void countLayer(Node r){
    System.out.println(r.left.key + r.right.key);
  }
}
class Node{
  int key;
  String value;
  Node left;
  Node right;
}