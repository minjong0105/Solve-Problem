#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<int> v(N);
        for(int i = 0; i < N; i++){
            cin >> v[i];
        }
        vector<int> dp(N, 1);
        int max_length = 1;
        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(v[j] < v[i]){
                    dp[i] = max(dp[i], dp[j] + 1);
                }
            }
            max_length = max(max_length, dp[i]);
        }
        cout << "#" << t << ' ' << max_length << '\n';
    }
    return 0;
}