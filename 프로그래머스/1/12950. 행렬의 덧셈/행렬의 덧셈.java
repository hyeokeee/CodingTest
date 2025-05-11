class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // 배열 arr1과 같은 크기의 2차원 배열 생성
        
        for (int i = 0;i < arr1.length;i++) {  // 0 ~ arr1.length-1 까지 반복 
            for (int j = 0;j < arr1[i].length;j++) { // 변수 j 가 0 부터 arr1[0].length-1까지 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;

    }
}