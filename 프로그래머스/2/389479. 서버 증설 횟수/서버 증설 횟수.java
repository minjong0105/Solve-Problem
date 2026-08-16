class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] end = new int[24];
        int running = 0;
        
        for (int i = 0; i < 24; i++) {
            running -= end[i];
            int need = players[i] / m;
            
            if (need > running) {
                int add = need - running;
                answer += add;
                running += add;
                if(i + k < 24) {
                    end[i + k] += add;
                }
            }
        }
        return answer;
    }
}