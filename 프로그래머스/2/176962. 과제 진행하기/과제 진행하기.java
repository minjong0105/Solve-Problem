import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        Arrays.sort(plans, (a, b) -> a[1].compareTo(b[1]));
        
        Stack<String[]> stack = new Stack<>();
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i < plans.length - 1; i++) {
            String[] cur = plans[i];
            String[] next = plans[i + 1];
            
            int curTime = min(cur[1]);
            int nextTime = min(next[1]);
            int playTime = Integer.parseInt(cur[2]);
            
            int diff = nextTime - curTime;
            if(playTime <= nextTime - curTime) {
                ans.add(cur[0]);
                int remain = diff - playTime;
                
                while(!stack.isEmpty() && remain > 0) {
                    String[] paused = stack.peek();
                    int pausedTime = Integer.parseInt(paused[1]);
                    
                    if(pausedTime <= remain) {
                        remain -= pausedTime;
                        ans.add(paused[0]);
                        stack.pop();
                    }else {
                        paused[1] = String.valueOf(pausedTime - remain);
                        remain = 0;
                    }
                }
                
            } else {
                stack.push(new String[]{cur[0], String.valueOf(playTime - diff)});
            } 
        }
            
        ans.add(plans[plans.length - 1][0]);
            
        while(!stack.isEmpty()) {
            ans.add(stack.pop()[0]);
        }
        
        return ans.toArray(new String[0]);
    }
    
    private int min(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        
        return hour * 60 + minute;
    }
}