public class PrintNodes {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 3;
    root.left = new Node();
    root.left.key = 1;
    root.right = new Node();
    root.right.key = 4;
    root.left.left = new Node();
    root.left.left.key = 3;
    root.right.left = new Node();
    root.right.left.key = 1;
    root.right.right = new Node();
    root.right.right.key = 5;
    // Print(root);

    // Second tree
    Node o = new Node();
    o.key = 3;
    o.left = new Node();
    o.left.key = 3;
    o.left.left = new Node();
    o.left.left.key = 4;
    o.left.right = new Node();
    o.left.right.key = 2;
    Print(o);
  }
  public static void Print(Node r){
    if(r == null){return;}
    System.out.println(r.key);
    Print(r.left);
    Print(r.right);
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
