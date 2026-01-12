import java.util.*;

class Solution {
    public int solution(String s) {
        // 초기화
        int answer = 0;
        Queue<String> originQueue = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            originQueue.add(s.substring(i, i + 1));
        }
        Map<String, String> map = new HashMap();
        map.put("{", "}");
        map.put("(", ")");
        map.put("[", "]");
        
        int size = s.length();
        
        for (int j = 0; j < size; j++) {
            Queue<String> queue = copyQueue((List<String>)originQueue);
            rotate(queue, j);
            
            Stack<String> stack = new Stack();
            for (int i = 0; i < size; i++) {
                String cha = queue.poll();
                
                if (!stack.isEmpty() 
                    && map.containsKey(stack.peek()) 
                    && map.get(stack.peek()).equals(cha)) {
                    stack.pop();
                } else {
                    stack.push(cha);    
                }
                queue.add(cha);
                
            }
            if (stack.isEmpty()) {
                answer++;
            }    
        }
        return answer;
    }
    
    void rotate (Queue<String> queue, int n ) {
        for (int k = 0; k < n; k++) {
            String str = queue.poll();
            queue.add(str);
        }
    }
    
    Queue<String> copyQueue(List<String> queue) {
        Queue<String> newOne = new LinkedList();
        
        for (int i = 0; i < queue.size(); i++) {
            newOne.add(queue.get(i));
        }
        
        return newOne;
    }
}