import java.util.Queue;
import java.util.LinkedList;
// CHECK FOR SYMMETRY!
public class BreadthFirst {
  public static void main(String[] z){
    // Symmetric;
    Node root = new Node();
    root.key = 1;
    root.left = new Node();
    root.left.key = 2;
    root.left.left = new Node();
    root.left.left.key = 3;
    root.left.right = new Node();
    root.left.right.key = 3;
    root.left.left.left = new Node();
    root.left.left.left.key = 5;
    root.left.right.right = new Node();
    root.left.right.right.key = 4;
    root.right = new Node();
    root.right.key = 2;
    root.right.left = new Node();
    root.right.left.key = 3;
    root.right.right = new Node();
    root.right.right.key = 3;
    root.right.left.left = new Node();
    root.right.left.left.key = 5;
    root.right.right.right = new Node();
    root.right.right.right.key = 5;
    System.out.println("Breadth First Search : Check Symmetry");
    System.out.println(printBreadth(root.left,true));
    System.out.println();
    System.out.println(printBreadth(root.right,false));
    System.out.print("Symmetrical? ");
    System.out.println(printBreadth(root.left,true).equals(printBreadth(root.right,false)));
    System.out.println();
    System.out.println("Depth First Search : Check Symmetry");
    // Check Symmetry by printing left & right 
    System.out.println(printDepth(root.left,""));
    System.out.println();
    System.out.println(printDepthRightFirst(root,""));
  }
  public static String printBreadth(Node root,boolean leftSide){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    String str = "";
    while(!queue.isEmpty()){
      Node tempHead = queue.poll();
      // System.out.print(tempHead.key + " ");
      str += tempHead.key;
      if(leftSide){
        if(tempHead.left != null){queue.add(tempHead.left);}
        if(tempHead.right != null){queue.add(tempHead.right);}
      } else{
        if(tempHead.right != null){queue.add(tempHead.right);}
        if(tempHead.left != null){queue.add(tempHead.left);}
      }
    }
    return str;
  }
  public static String printDepth(Node root,String str){
    if(root == null){return "";}
    str += root.key;
    System.out.print(root.key + " ");
    String A = printDepth(root.left,str+root.key);
    String B = printDepth(root.right,str+root.key);
    return str;
  }
  public static String printDepthRightFirst(Node root,String str){
    if(root == null){return "";}
    // System.out.print(root.key + " ");
    if(root.left == null && root.right == null){return str;}
    String A = printDepthRightFirst(root.right,str+root.key);
    String B = printDepthRightFirst(root.left,str+root.key);
    return A+B;
  }

}
class Node{
  int key;
  Node left;
  Node right;
}
