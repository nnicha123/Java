public class ExampleTwo {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,5);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,7);
    root = insert(root,9);
    root = insert(root,10);
    System.out.println(root.key);
    System.out.println(root.left.key);
    // System.out.println(root.left.left.key);
    System.out.println(root.right.key);
    System.out.println(root.right.left.key);
    System.out.println(root.right.right.key);
  }
  public static Node insert(Node r, int k){
    if(r == null){
      r = new Node();
      r.key = k;
    } else {
      if(k < r.key) r.left = insert(r.left,k);
      if(k > r.key) r.right = insert(r.right,k);
    }
    return r;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
