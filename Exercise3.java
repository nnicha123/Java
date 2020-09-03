public class Exercise3 {
  public static void main(String[] z){
    int num = 3;
    System.out.println(num);
    while(num > 1){
      if(num % 2 != 0){ 
        num = num*3 + 1;
        System.out.println(num);
        continue;
      }
      if(num % 2 == 0) {
        num = num /2;
        System.out.println(num);
        continue;
      }
      
    }
  }
}