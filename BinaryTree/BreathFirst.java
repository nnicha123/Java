public class BreathFirst {
  public static void main(String[] z){
    int target = 8;
    int[] width = {1,4,5};
    String[] queue = new String[1000];
    int front=0, rear = 0;
    queue[rear] = "";
    rear++;
    while(front < rear){
      String current = queue[front];
      front++;
      int point = 0;
      String w = "";
      char[] a = current.toCharArray();
      for(int i=0;i<a.length;i++){
        point = point + width[a[i] - '0'];
        w = w + width[a[i] - '0'];
      }
      if(point == target){System.out.println(w);}
      else{
        for(int i=0;i<width.length;i++){
          if(point + width[i] <= target){
            queue[rear] = current+i;
            rear++;
          }
        }
      }
    }
  }
}
