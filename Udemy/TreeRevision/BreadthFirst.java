import java.util.*;
public class BreadthFirst {
  public static void main(String[] z){
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(7);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(6);
    root.left.right.left = new TreeNode(5);
    root.left.right.right = new TreeNode(11);
    root.right.right = new TreeNode(9);
    root.right.right.left = new TreeNode(4);
    // System.out.println(printBreadth(root));
    // List<Integer> resultList = new ArrayList<Integer>();
    // printDepth(root, resultList);
    // System.out.println(resultList);
    System.out.println(sumLevel(root));
    // System.out.println(maxLevel(root));
    System.out.println(maxLevelInd(root));
  }
  public static List<Integer> maxLevelInd(TreeNode root){
    if(root == null) return new ArrayList<Integer>();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    List<Integer> result = new ArrayList<Integer>();
    int maxSum = Integer.MIN_VALUE;
    int maxLevel = 1;
    int level = 0;
    queue.add(root);
    while(!queue.isEmpty()){
      int qSize = queue.size();
      int sumLevel = 0;
      level++;
      for(int i=0;i<qSize;i++){
        TreeNode temp = queue.poll();
        if(temp.left != null) queue.add(temp.left);
        if(temp.right != null) queue.add(temp.right);
        sumLevel += temp.val;
      }
      if(sumLevel > maxSum){
        maxSum = sumLevel;
        maxLevel = level;
      }
    }
    result.add(maxSum);
    result.add(maxLevel);
    return result;
  }
  public static int maxLevel(TreeNode root){
    if(root == null){return 0;}
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int maxSum = Integer.MIN_VALUE;
    while(!queue.isEmpty()){
      int levelSum = 0;
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        TreeNode temp = queue.poll();
        if(temp.left != null) queue.add(temp.left);
        if(temp.right != null) queue.add(temp.right);
        levelSum += temp.val;
      }
      if(levelSum > maxSum){maxSum = levelSum;}
    }
    return maxSum;
  }
  public static List<Integer> sumLevel(TreeNode root){
    if(root == null){return new ArrayList<Integer>();}
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    List<Integer> result = new ArrayList<Integer>();
    queue.add(root);
    while(!queue.isEmpty()){
      int levelSum = 0;
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        TreeNode temp = queue.poll();
        if(temp.left != null) queue.add(temp.left);
        if(temp.right != null) queue.add(temp.right);
        levelSum += temp.val;
      }
      result.add(levelSum);
    }
    return result;
  }
  public static List<List<Integer>> printBreadth(TreeNode root){
    if(root == null)return new ArrayList<List<Integer>>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      List<Integer> level = new ArrayList<Integer>();
      int qSize = queue.size();
      for(int i=0;i<qSize;i++){
        TreeNode temp = queue.poll();
        if(temp.left != null) queue.add(temp.left);
        if(temp.right != null) queue.add(temp.right);
        level.add(temp.val);
      }
      Collections.reverse(level);
      result.add(level);
    }
    return result;
  }
  public static void printDepth(TreeNode root, List<Integer> list){
    if(root == null){return;}
    else list.add(root.val);
    printDepth(root.left,list);
    printDepth(root.right,list);
  }
}
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int val){
    this.val = val;
    this.left = null;
    this.right = null;
  }
}