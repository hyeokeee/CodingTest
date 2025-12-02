class Solution {
    public long[] solution(long[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int tail = Long.numberOfTrailingZeros(~numbers[i]);
            if (tail <= 1) {
                numbers[i]++;
            } else {
                numbers[i] += Math.pow(2, tail - 1);
            }
        }
        
        return numbers;
    }
}