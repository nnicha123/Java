class Preview{
  public static void main(String[] z){
    int num = 12;
    int row = 1;
    while(true){
      if(num <= 0){
        break;
      }
      for(int i=1;i<=row && num>0;i++){
        System.out.print('o');
        num = num -1;
      }
      System.out.println();
      row++;
    }
  }
}