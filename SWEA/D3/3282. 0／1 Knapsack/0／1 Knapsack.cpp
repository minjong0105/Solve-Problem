#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, K;
        cin >> N >> K;
        vector<int> v(N), c(N);
        for(int i = 0; i < N; i++){
            cin >> v[i] >> c[i];
        }
        vector<int> dp(K + 1, 0);
        for(int i = 0; i < N; i++){
            for(int j = K; j >= v[i]; j--){
                dp[j] = max(dp[j], dp[j - v[i]] + c[i]);
            }
        }

        cout << "#" << t << ' ' << dp[K] << '\n';
    }
    return 0;
}