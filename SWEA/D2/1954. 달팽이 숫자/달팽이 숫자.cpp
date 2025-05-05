#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<vector<int>> snail(N, vector<int>(N, 0));
        int change = 0;
        int x = 0, y = 0;
        for(int i = 1; i <= N * N; i++){
            snail[x][y] = i;
            int nx = x, ny = y;
            
            if(change == 0){
                ny++;
            }else if(change == 1){
                nx++;
            }else if(change == 2){
                ny--;
            }else if(change == 3){
                nx--;
            }

            if(nx < 0 || ny < 0 || nx >= N || ny >= N || snail[nx][ny] != 0){
                change = (change + 1) % 4;
                
                if(change == 0){
                    y++;
                }else if(change == 1){
                    x++;
                }else if(change == 2){
                    y--;
                }else if(change == 3){
                    x--;
                }
            }else{
                x = nx;
                y = ny;
            }
        }
        cout << "#" << t << '\n';
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cout << snail[i][j] << " ";
            }
            cout << '\n';
        }
    }
    return 0;
}