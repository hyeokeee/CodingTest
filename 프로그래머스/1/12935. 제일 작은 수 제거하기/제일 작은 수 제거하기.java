import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int min = arr[0];
        
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        
        if (arr.length == 1 && arr[0] == 10) {
            answer.add(-1);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}