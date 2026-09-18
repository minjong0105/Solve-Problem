class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int total = brown + yellow;
        
        for (int h = 3; h * h <= total; h++) {
            if (total % h == 0) {
                int w = total / h;
                
                if ((w - 2) * (h - 2) == yellow) {
                    answer = new int[]{w, h};
                    return answer;
                }
            }
        }
        
        return answer;
    }
}