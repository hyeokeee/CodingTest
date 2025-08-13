import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int totalProfit = 0;
        int boxCount = score.length;
        while (boxCount - m >= 0) {
            boxCount -= m;
            int minScore = score[boxCount];
            totalProfit += minScore * m;
        }

        return totalProfit;
    }
}