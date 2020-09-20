public class InvertTree {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 5;
    root.left = new Node();
    root.left.key = 3;
    root.left.left = new Node();
    root.left.left.key = 2;
    root.left.right = new Node();
    root.left.right.key = 4;
    root.right = new Node();
    root.right.key = 8;
    root.right.left = new Node();
    root.right.left.key = 7;
    root.right.right = new Node();
    root.right.right.key = 9;
    Node newNode = invertNode(root);
    System.out.println(newNode.left.key);
    System.out.println(newNode.left.left.key);
  }
  public static Node invertNode(Node root){
    if(root == null){return root;}
    Node right = invertNode(root.right);
    Node left = invertNode(root.left);
    root.left = right;
    root.right = left;
    return root;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}