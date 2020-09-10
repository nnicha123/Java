import java.util.*;
public class Exercise5 {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,6);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,2);
    root = insert(root,6);
    root = insert(root,9);
    System.out.println(total(root));
  }
  public static int total(Node r){
    if(r == null) return 0;
    return total(r.left) + total(r.right) + r.left.key + r.right.key;
  }
  public static Node insert(Node r, int k){
    if(r == null){
      r = new Node();
      r.key = k;
    } else{
      if(k<=r.key) r.left = insert(r.left,k);
      if(k>r.key) r.right = insert(r.right,k);
    }
    return r;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
