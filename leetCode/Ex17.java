public class Ex17 {
  public static void main(String[] z) {
    System.out.println(arrangeCoins(15));
  }

  public static int arrangeCoins(int n) {
    int row = 1;
    while (n > 0) {
      for (int i = 0; i < row; i++) {
        if (n <= 0) {
          return row - 1;
        }
        System.out.print("o");
        n--;
      }
      row++;
      System.out.println();
    }
    return row - 1;
  }
}
