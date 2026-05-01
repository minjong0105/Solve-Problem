class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n + 2];
        for(int l : lost) {
            arr[l]--;
        }
        
        for(int r : reserve) {
            arr[r]++;
        }
        
        int ans = n;
        
        for(int i = 1; i <= n; i++) {
            if(arr[i] == -1){
                if(arr[i - 1] == 1) {
                    arr[i - 1]--;
                    arr[i]++;
                }
                else if(arr[i + 1] == 1) {
                    arr[i + 1]--;
                    arr[i]++;
                }
                
                else {
                    ans--;
                }
            }
        }
        
        return ans;
    }
}