public class Exercise1 {
  public static void main(String[] z){
    int area = 2872;
    int rai = area/1600;
    int ngan = (area - 1600)/400;
    int tarangwa = (area - 1600 - ngan*400)/4;
    System.out.println(rai + " Rai");
    System.out.println(ngan + " Ngan");
    System.out.println(tarangwa + " Tarangwa");
  }
}