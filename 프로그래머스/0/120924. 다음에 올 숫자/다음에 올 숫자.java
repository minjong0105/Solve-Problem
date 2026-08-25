class Solution {
    public int solution(int[] common) {
        int dif1 = common[1] - common[0];
        int dif2 = common[2] - common[1];
        
        if (dif2 == dif1) {
            return common[common.length - 1] + dif1;
        } else {
            int ratio = dif2 / dif1;
            return common[common.length - 1] * ratio;
        }
    }
}