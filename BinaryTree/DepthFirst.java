public class DepthFirst {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,5);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,7);
    root = insert(root,9);
    root = insert(root,10);
  }
  public static Node insert(Node root, int key){
    if(root == null){
      root = new Node();
      root.key = key;
    }
    else{
      if(key < root.key){root.left = insert(root.left,key);}
      if(key > root.key){root.right = insert(root.right,key);}
    }
    return root;
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
