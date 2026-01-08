import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
        int zero = 0;
        
        for(int lotto: lottos){
            if(lotto==0){
                zero++;
            }else if(contains(win_nums, lotto)){
                same++;
            }
        }
        
    int maxRank = getRank(same+zero);
    int minRank = getRank(same);
    
    return new int[]{maxRank,minRank};
         }
    
     private boolean contains(int[] win_nums, int num){
            for(int win_num: win_nums){
            if(win_num==num) return true;
            }
            return false;
        }
    
    private int getRank(int correct){
        switch(correct){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default : return 6;
        }
    }
}