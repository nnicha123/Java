public class AddStrings {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 4;
    root.left = new Node();
    root.left.key = 9;
    root.right = new Node();
    root.right.key = 0;
    root.left.left = new Node();
    root.left.left.key = 5;
    root.left.right = new Node();
    root.left.right.key = 1;
    System.out.println(addString(root,0));
  }
  public static int addString(Node root, int num){
    if(root == null){return 0;}
    num = num*10 + root.key;
    if(root.left == null && root.right == null){
      return num;
    }
    int a = addString(root.left,num);
    int b = addString(root.right,num);
    return a + b;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
