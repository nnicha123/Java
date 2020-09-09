public class Eleven {
  public static void main(String[] z){
    System.out.println(hit("NESEN","EEN"));
    System.out.println(hit("SEEN","ESN"));
  }
  public static boolean hit(String str1, String str2){
    int x1 = 0;int y1 = 0; int x2=0; int y2 = 0;
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();
    for(int i=0;i<ch1.length;i++){
      if(ch1[i] == 'N'){ y1++; }
      if(ch1[i] == 'S'){ y1--; }
      if(ch1[i] == 'E'){ x1++; }
      if(ch1[i] == 'W'){ x1--; }
    }
    for(int j=0;j<ch2.length;j++){
      if(ch2[j] == 'N'){ y2++; }
      if(ch2[j] == 'S'){ y2--; }
      if(ch2[j] == 'E'){ x2++; }
      if(ch2[j] == 'W'){ x2--; }
    }
    
    return (x1==x2 && y1==y2);
  }
}
