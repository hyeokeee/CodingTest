/**
* 1. idx 변수는 각 단어가 짝수 번째인지 홀수 번째인지 판단하기 위한 용도
  2. 주어진 문자열 s를 split() 함수를 사용하여 배열로 변환한다.
  3. 배열 길이 만큼 반복하여 짝수 번째인지 홀수 번째 판단한다.
  4. 만약 현재 문자가 공백인 경우 idx를 1로 설정하여 다음 단어가 짝수 번째에 위치하도록 한다.
  5. 현재 단어가 짝수 번째일 경우 대문자, 홀수 번째일 경우 소문자로 변환하여 answer에 이어 붙인다.
*/



class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int idx = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(" ")) {
                idx = 1;
            }
            
            answer += idx % 2 == 0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
            idx++;
        }
        
        return answer;
    }
}