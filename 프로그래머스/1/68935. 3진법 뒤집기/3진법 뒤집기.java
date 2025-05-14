class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = Integer.toString(n,3);
        String b = "";
        
        for(int i = Integer.toString(n, 3).length() - 1; i >= 0; i--) {
            b += Integer.toString(n, 3).charAt(i);
        }
        answer = Integer.parseInt(b,3);
        return answer;
    }
}