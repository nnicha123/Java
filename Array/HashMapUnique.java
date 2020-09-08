import java.util.HashMap;

public class HashMapUnique {
  public static void main(String[] z){
    int[] a = {7,3,2,3,7,1};
    uniqueCharacter(a);
  }
  public static void uniqueCharacter(int[] inputArr){
    String str = inputArr.toString();
    HashMap<Integer,Integer> uniqueCountMap= new HashMap<Integer,Integer>();
    int count = 0;
    for(int i: inputArr){
      if(!uniqueCountMap.containsKey(i)){
        uniqueCountMap.put(i,1);
        count++;
      } else{
        uniqueCountMap.put(i,uniqueCountMap.get(i)+1);
      }
    }
    System.out.println(count + " unique values" +" : "+uniqueCountMap);
  }
}
