#include <iostream>
#include <vector>
using namespace std;

int N, L, max_score;
vector<int> T;
vector<int> K;

void dfs(int i, int score_sum, int cal_sum){
    if(cal_sum > L){
        return;
    }

    if(i == N){
        if(score_sum > max_score){
            max_score = score_sum;
        }
        return;
    }

    dfs(i +1, score_sum + T[i], cal_sum + K[i]);

    dfs(i + 1, score_sum, cal_sum);
}

int main(){
    int test_case;
    cin >> test_case;
    for(int t = 1; t <= test_case; t++){
        cin >> N >> L;
        T.clear();
        K.clear();
        for(int i = 0; i < N; i++){
            int x, y;
            cin >> x >> y;
            T.push_back(x);
            K.push_back(y);
        }

        max_score = 0;
        dfs(0, 0, 0);

        cout << "#" << t << ' ' << max_score << '\n';
    }
    return 0;
}