#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, M;
        cin >> N >> M;
        vector<vector<int>> num(N, vector<int>(N));
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cin >> num[i][j];
            }
        }
        int max_count = 0;
        for(int i = 0; i <= N - M; i++){
            for(int j = 0; j <= N - M; j++){
                int count = 0;
                for(int x = 0; x < M; x++){
                    for(int y = 0; y < M; y++){
                        count += num[i + x][j + y];
                    }
                }
                if(count > max_count) {
                    max_count = count;
                }
            }
        }
        cout << "#" << t << " " << max_count << "\n";
    }
    return 0;
}