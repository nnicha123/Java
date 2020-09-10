public class ExampleThree {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,5);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,7);
    root = insert(root,9);
    root = insert(root,10);
    System.out.println((search(root,7)).key);
    System.out.println(search(root,6));
    System.out.println(search(root,9));
  }
  public static Node search(Node r, int k){
    if(r == null) return null;
    if(k < r.key) return search(r.left,k);
    if(k > r.key) return search(r.right,k);
    return r;
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