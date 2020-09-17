public class CheckSame {
  public static void main(String[] z){
    // First tree
    Node root = new Node();
    root.key = 1;
    root.left = new Node();
    root.left.key = 2;
    root.right = new Node();
    root.right.key = 2;
    root.left.left = new Node();
    root.left.left.key = 3;
    root.left.right = new Node();
    root.left.right.key = 4;
    root.right.left = new Node();
    root.right.left.key = 4;
    root.right.right = new Node();
    root.right.right.key = 3;

    //System.out.println(isSameTree(root,r2));
    System.out.println(isSymmetric(root));
  }
  public static boolean isSameTree(Node root, Node root2){
    if(root == null && root2 == null){return true;}
    if(root == null || root2 == null){
      return false;
    }
    return root.key == root2.key && isSameTree(root.left,root2.left) && isSameTree(root.right,root2.right);
  }
  public static boolean isSymmetric(Node root){
    if(root.left == null && root.right == null){return true;}
    if(root.left == null || root.right == null){return root.left.key == root.right.key;}
    System.out.println(root.left.key + " " + root.right.key);
    return isSymmetric(root.left) && isSymmetric(root.right);
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
