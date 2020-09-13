import java.util.*;

public class Ex13 {
  public static void main(String[] z) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3;
    int n = 2;
    merge(nums1, m, nums2, n);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int j = 0;
    for (int i = 0; i < nums1.length; i++) {
      if (nums1[i] == 0) {
        nums1[i] = nums2[j];
        j++;
      }
    }
    Arrays.sort(nums1);
    for (int k = 0; k < nums1.length; k++) {
      System.out.println(nums1[k]);
    }
  }
}
