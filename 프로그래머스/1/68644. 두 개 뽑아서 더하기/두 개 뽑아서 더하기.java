import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arrAnswer = new ArrayList<Integer>();
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length-1; i++) { 
        	for(int j=i+1; j<numbers.length; j++) { 
        		int sum = numbers[i]+numbers[j];
        		if(!arrAnswer.contains(sum)) {
        			arrAnswer.add(sum); 
        		}
        	}
        }
        int[] answer = new int[arrAnswer.size()];
        
        for(int i=0; i<arrAnswer.size(); i++) {
        	answer[i] = arrAnswer.get(i).intValue();
        }
        Arrays.sort(answer);
        return answer;
    }
}