public class Removal {
  public static void main(String[] z){
    Node root = null;
    root = insert(root,5);
    root = insert(root,3);
    root = insert(root,8);
    root = insert(root,2);
    root = insert(root,7);
    root = insert(root,9);

    //print Node that is removed;
    System.out.println(remove(root,7));
  }
  public static Node insert(Node r, int k){
    if(r == null){ 
      r = new Node();
      r.key = k;
    } else {
      if( k < r.key) r.left = insert(r.left,k); 
      if( k > r.key) r.right = insert(r.right,k); 
    }
    return r;
  }
  public static Node remove(Node r,int k){
    if(r == null) return null;
    if( k == r.key){
      if( r.left == null && r.right == null) return null;
      if( r.left == null && r.right != null) return r.right;
      if( r.left != null && r.right == null) return r.left;
      if( r.left != null && r.right != null){
        Node m = getMinimumNode(r.right);
        r.key = m.key;
        r.right = remove(r.right,m.key);
        return r;
      }
    }
    // Do until find k == r.key (above) i.g. loop until r is the r we want to remove
    if(k<r.key) r.left = remove(r.left,k);
    if(k>r.key) r.right = remove(r.right,k);
    return r;
  }
  public static Node getMinimumNode(Node r){
    if(r == null) return r;
    if(r.left == null) return r;
    return getMinimumNode(r.left);
  }
}
class Node{
  int key;
  Node left;
  Node right;
}
