import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int num = -1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int n: arr) {
            if(num != n) {
                list.add(n);
                num = n;
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}