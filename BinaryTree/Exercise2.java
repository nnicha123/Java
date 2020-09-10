public class Exercise2 {
   public static void main(String[] z){
    System.out.println(countMatch(10));
   }
   public static int countMatch(int num){
     int count = 0;
     if(num % 2 != 0) count++;
     while(num >=1 ){
       System.out.println(num);
       num = num/2;
       count += num;
     }
     return count;
   }
}
