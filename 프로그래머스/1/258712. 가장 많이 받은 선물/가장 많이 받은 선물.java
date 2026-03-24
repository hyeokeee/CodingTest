import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[][] data = new int[friends.length][friends.length];
        int[] giftcount = new int[friends.length];
        
        Map<String,Integer> map = new HashMap<>();
        for (int i=0; i<friends.length; i++) map.put(friends[i],i);
        for (int i=0; i<gifts.length; i++) {
            String[] arr = gifts[i].split(" ");
            data[map.get(arr[0])][map.get(arr[1])]++;
            giftcount[map.get(arr[0])]++;
            giftcount[map.get(arr[1])]--;
        }
        
        int max = 0;
        for (int i=0; i<friends.length; i++) {
            int temp = 0;
            for (int j=0; j<friends.length; j++) {
                if (data[i][j]>data[j][i]) temp++;
                else if (data[i][j]==data[j][i] && giftcount[i]>giftcount[j]) temp++;
            }
            max = Math.max(max,temp);
        }
        return max;
    }
}