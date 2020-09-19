public class TestPrintNode {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 8;
    root.left = new Node();
    root.left.key = 3;
    root.right = new Node();
    root.right.key = 10;
    root.left.left = new Node();
    root.left.left.key = 1;
    root.left.right = new Node();
    root.left.right.key = 6;
    root.left.right.left = new Node();
    root.left.right.left.key = 4;
    root.left.right.right = new Node();
    root.left.right.right.key = 7;
    root.right.right = new Node();
    root.right.right.key = 14;
    root.right.right.left = new Node();
    root.right.right.left.key = 13;
    depthPrint(root,"");
    System.out.println("-------");
  }
  public static void depthPrint(Node root,String str){
    if(root == null){return;}
    if(root.left == null && root.right == null){
      return;
    }
    depthPrint(root.left,str+root.key);
    System.out.println(str);
    depthPrint(root.right,str+root.key);
  }
  
}
class Node{
  int key;
  Node left;
  Node right;
}
