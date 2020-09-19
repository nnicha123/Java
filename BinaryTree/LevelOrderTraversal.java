import java.util.Queue;
import java.util.LinkedList;
class LevelOrderTraversal {
  Node root;

  void printLevelOrder(){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty()){
      Node tempHead = queue.poll();
      System.out.print(tempHead.data + " ");
      if(tempHead.left != null){queue.add(tempHead.left);}
      if(tempHead.right != null){queue.add(tempHead.right);}
    }
  }
  public static void main(String[] z){
    LevelOrderTraversal treeLevel = new LevelOrderTraversal();
    treeLevel.root = new Node(1);
    treeLevel.root.left = new Node(2);
    treeLevel.root.right = new Node(3);
    treeLevel.root.left.left = new Node(4);
    treeLevel.root.left.right = new Node(5);
    System.out.println("Level order traversal of binary tree is: ");
    treeLevel.printLevelOrder();
  }
}
class Node{
  int data;
  Node left,right;

  public Node(int item){
    data = item;
    left = null;
    right = null;
  }
}

