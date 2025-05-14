#include <iostream>
using namespace std;

int N, K, answer;
int num[20];

void dfs(int i, int sum){
    if(sum > K) return;

    if(i == N){
        if(sum == K) answer++;
        return;
    }

    dfs(i + 1, sum + num[i]);

    dfs(i + 1, sum);
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        cin >> N >> K;
        for(int i = 0; i < N; i++){
            cin >> num[i];
        }
        
        answer = 0;
        dfs(0, 0);

        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}