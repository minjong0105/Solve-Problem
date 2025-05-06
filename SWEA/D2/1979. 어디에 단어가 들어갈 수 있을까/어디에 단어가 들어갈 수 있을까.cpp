#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, K;
        cin >> N >> K;
        vector<vector<int>> block(N, vector<int>(N));
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cin >> block[i][j];
            }
        }
        int sum = 0;
        for(int x = 0; x < N; x ++){
            int count = 0;
            for(int y = 0; y <= N; y++){
                if(y < N && block[x][y] == 1){
                    count++;
                }else{
                    if(count == K){
                        sum++;
                    }
                    count = 0;
                }
            }
        }
        for(int y = 0; y < N; y++){
            int count = 0;
            for(int x = 0; x <= N; x++){
                if(x <  N && block[x][y] == 1){
                    count++;
                }else{
                    if(count == K){
                        sum++;
                    }
                    count = 0;
                }
            }
        }
        cout << "#" << t << " " << sum << '\n';
    }
    return 0;
}