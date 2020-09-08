import java.util.*;

public class SequentialTwo {
  public static void main(String[] z){
    int[] cards = {6,8,4,8,6};
    String result = "No";

    Scanner in = new Scanner(System.in);
    System.out.print("Enter target:");
    int target = in.nextInt();
    System.out.println("Target is : " + target);
    Arrays.sort(cards);
    for(int i = 0;i<cards.length;i++){
      int right=i+1;
      if(right < cards.length){
        if(cards[i] + cards[right] == target){
          result = "Yes";
          break;
        }
      }
    }
    System.out.println(result);
  }
}
