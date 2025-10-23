import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        set.add(x);
        
        int idx = 0;
        run : while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int now = q.poll();
                if(now == y){
                    answer = idx;
                    break run;
                } else {
                    if(now+n<=y && !set.contains(now+n)){
                        set.add(now+n);
                        q.add(now+n);
                    }
                    if(now*2<=y && !set.contains(now*2)){
                        set.add(now*2);
                        q.add(now*2);
                    }
                    if(now*3<=y && !set.contains(now*3)){
                        set.add(now*3);
                        q.add(now*3);
                    }
                }
            }
            
            idx++;
        }
        
        return answer;
    }
}