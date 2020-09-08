import java.util.*;
class ArrayTwo{
  public static void main(String[] z){
    double[] score = {8.9,8.5,8.7,8.5,8.2};
    Arrays.sort(score);
    int i =0;
    while(i<score.length){
        System.out.println(score[i]);
        i++;
    }
  }
}