import java.util.*;
public class Exercise3 {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,6);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,2);
    root = insert(root,6);
    root = insert(root,9);
    // System.out.println(root.key);
    // System.out.println(root.left.key);
    // System.out.println(root.right.key);
    // System.out.println(root.left.left.key);
    // System.out.println(root.left.right.key);
    // System.out.println(root.right.right.key);
    // System.out.println(maxLeft(root));
    System.out.println(maxRight(root));
  }
  public static Node insert(Node r, int k){
    if(r == null){
      r = new Node();
      r.key = k;
    }
    else{
      if(k <= r.key) r.left = insert(r.left,k);
      if(k > r.key) r.right = insert(r.right,k);
    }
    return r;
  }
  public static int maxLeft(Node r){
    if(r == null) return 0;
    return maxLeft(r.left)+r.key;
  }
  public static int maxRight(Node r){
    if(r == null) return 0;
    System.out.println(r.key);
    return maxRight(r.right)+r.key;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}