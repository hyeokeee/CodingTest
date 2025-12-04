import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> intList = new ArrayList<>();
        
        int to = dy(today);
    
        
        int td = 0;
        int terms_day = 0;
        
        for(String st : terms){
            terms_day = Integer.parseInt(st.substring(2)) * 28;
            for(int i = 0; i < privacies.length; i++){
                td = dy(privacies[i]);
                if(st.substring(0,1).equals(privacies[i].substring(11))){
                    td += terms_day;
                    if(to - td >= 0){
                    intList.add(i + 1);
                }
                }
            }
        }
        
        
        
            int[] answer = intList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        
        return answer;
    }
    
    public static int dy(String to){
        int td = Integer.parseInt(to.substring(0, 4)) * 12 * 28;
        td += Integer.parseInt(to.substring(5, 7)) * 28;
        td += Integer.parseInt(to.substring(8, 10));
        
        return td;
    }
}