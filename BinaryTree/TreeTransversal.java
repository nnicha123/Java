public class TreeTransversal {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,5);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,2);
    root = insert(root,7);
    root = insert(root,9);
    show(root);
  }
  public static Node insert(Node r, int k){
    if(r == null){
      r = new Node();
      r.key = k; 
    } else {
      if( k < r.key ) r.left = insert(r.left,k);
      if( k > r.key ) r.right = insert(r.right,k);
    }
    return r;
  }
  public static void show(Node r){
    if(r != null){
      show(r.left);
      System.out.println(r.key);
      show(r.right);
    }
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
