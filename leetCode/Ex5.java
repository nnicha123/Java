import java.util.*;
public class Ex5 {
  public static void main(String[] z){
    // System.out.println(lengthOfLongestSubstring("abcabcbb"));
    // System.out.println(lengthOfLongestSubstring("bbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
    System.out.println(lengthOfLongestSubstring(""));

  }
  public static int lengthOfLongestSubstring(String s){
    char[] c = s.toCharArray();int left = 0; int right = 1; int count=0; int maxCount=0;
    if(c.length == 0){return 0;}
    while(right < c.length){
      if(maxCount < count){maxCount = count;}
      if(c[left] != c[right]){ right++; left++;
      }
      else{ 
        count = right - left;
        left = right;
        right = left + 1;
      }
    }
    return maxCount;
    }
  }

