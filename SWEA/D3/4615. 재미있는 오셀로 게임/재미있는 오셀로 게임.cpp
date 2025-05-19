#include <iostream>
#include <vector>
using namespace std;

int dx[8] = {-1, 1, 0, 0, -1, 1, -1, 1};
int dy[8] = {0, 0, -1, 1, -1, -1, 1, 1};

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, M;
        cin >> N >> M;
        vector<vector<int>> board(N + 1, vector<int>(N + 1, 0));

        board[N/2][N/2] = 2;
        board[N/2 + 1][N/2 + 1] = 2;
        board[N/2 + 1][N/2] = 1;
        board[N/2][N/2 + 1] = 1;

        for(int i = 0; i < M; i++){
            int x, y, color;
            cin >> y >> x >> color;
            board[x][y] = color;

            for(int d = 0; d < 8; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                vector<pair<int, int>> flip;

                while(nx >= 1 && ny >= 1 && nx <= N && ny <= N && board[nx][ny] != 0 && board[nx][ny] != color){
                    flip.push_back({nx, ny});
                    nx += dx[d];
                    ny += dy[d];
                }

                if(nx >= 1 && ny >= 1 && nx <= N && ny <= N && board[nx][ny] == color){
                    for(auto[fx, fy] : flip){
                        board[fx][fy] = color;
                    }
                }
            }
        }

        int black = 0, white = 0;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(board[i][j] == 1) black++;
                if(board[i][j] == 2) white++;
            }
        }
        cout << "#" << t << ' ' << black << ' ' << white << '\n';
    }
    return 0;
}