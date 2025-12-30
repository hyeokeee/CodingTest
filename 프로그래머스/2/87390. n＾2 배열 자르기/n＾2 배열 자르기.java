import java.util.*;
 
public class Solution {
    public static int[] solution(int n, long left, long right) {
        
        int length = (int)(right - left) + 1;
        int[] result = new int[length];
 
        int idx = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n + 1;
            long col = i % n + 1;
            result[idx++] = (int) Math.max(row, col);
        }
 
        return result;
    }
}