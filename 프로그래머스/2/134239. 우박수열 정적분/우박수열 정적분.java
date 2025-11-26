import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        List<Integer> ys = new ArrayList<>();
        ys.add(k);
        int current = k;
        while (current != 1) {
            int next = current % 2 == 0 ? current / 2 : current * 3 + 1;
            ys.add(next);
            current = next;
        }

        int n = ys.size();
        int lastX = n - 1;

        // 누적 면적(prefix sum) 계산
        double[] prefix = new double[n];
        for (int i = 1; i < n; i++) {
            double area = (ys.get(i - 1) + ys.get(i)) / 2.0;
            prefix[i] = prefix[i - 1] + area;
        }

        double[] result = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int a = ranges[i][0];
            int b = ranges[i][1];
            int end = lastX + b;

            // 시작이 끝보다 크면 -1.0, 아니면 구간 면적 계산
            result[i] = -1.0;
            if (a <= end) {
                int startIdx = Math.max(0, a);
                int endIdx = Math.max(0, end);
                startIdx = Math.min(prefix.length - 1, startIdx);
                endIdx = Math.min(prefix.length - 1, endIdx);
                result[i] = prefix[endIdx] - prefix[startIdx];
            }
        }
        return result;
    }
}