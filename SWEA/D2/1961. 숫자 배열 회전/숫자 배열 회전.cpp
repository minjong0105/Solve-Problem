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
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cin >> v[i][j];
            }
        }

        vector<vector<int>> r(N * 3, vector<int>(N * 3));
        //90도
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                r[x][y] = v[N - 1 - y][x];
            }
        }
        //180도
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                r[x][N + y] = v[N - 1 -x][N - 1 - y];
            }
        }
        //270도
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                r[x][2 * N + y] = v[y][N - 1 - x];
            }
        }
        cout << "#" << t << '\n';
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3 * N; j += N){
                for(int k = j; k < N + j; k++){
                    cout << r[i][k];
                }
                cout << ' ';
            }
            cout << '\n';
        }
    }
    return 0;
}