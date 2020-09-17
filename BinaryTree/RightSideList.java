public class RightSideList {
  public static void main(String[] z){
    Node root = new Node();
    root.key = 1;
    root.left = new Node();
    root.left.key = 2;
    root.right = new Node();
    root.right.key = 3;
    root.left.right = new Node();
    root.left.right.key = 5;
    root.right.right = new Node();
    root.right.right.key = 4;
  }
  public static List<Integer> rightSideView(Node root, ArrayList<Integer> a){
    if(root == null){return null;}
    if(root.left == null && root.right == null){
      return a;
    }
    a.add(root.key);
    return rightSideView(root.right, a);
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
