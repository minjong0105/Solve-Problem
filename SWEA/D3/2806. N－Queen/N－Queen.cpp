#include <iostream>
#include <vector>
using namespace std;

int N, count;

bool safe(int col, int row, vector<int>& v){
    for(int prev_row = 0; prev_row < row; prev_row++){
        int prev_col = v[prev_row];
        if(prev_col == col || abs(prev_row - row) == abs(prev_col - col)){
            return false;
        }
    }
    return true;
}

void dfs(int row, vector<int>& v){
    if(row == N){
        count++;
        return;
    }
    for(int col = 0; col < N; col++){
        if(safe(col, row, v)){
            v[row] = col;
            dfs(row + 1, v);
        }
    }
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        cin >> N;
        count = 0;
        vector<int> v(N, -1);

        dfs(0, v);

        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}