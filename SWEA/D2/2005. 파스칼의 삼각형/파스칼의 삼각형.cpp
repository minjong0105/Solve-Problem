#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<vector<int>> v(N, vector<int>(N));
        v[0][0] = 1;
        for(int i = 1; i < N; i++){
            v[i][0] = 1;
            v[i][i] = 1;
            for(int j = 1; j < i; j++){
                v[i][j] = v[i-1][j-1] + v[i-1][j];
            }
        }
        cout << "#" << t << '\n';
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                cout << v[i][j] << " ";
            }
            cout << '\n';
        }
    }
    return 0;
}