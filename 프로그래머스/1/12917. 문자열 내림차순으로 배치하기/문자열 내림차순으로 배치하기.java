import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        
        // 배열 str 정렬, 내림차순
        Arrays.sort(str, Collections.reverseOrder());
        
        // 배열 str의 각 요소를 가져옴
        for (String a : str) {
            // answer에 각 요소 a 값을 순차적으로 추가 해서 새로운 문자열 
            answer += a;
        }
        
        return answer;
    }
}