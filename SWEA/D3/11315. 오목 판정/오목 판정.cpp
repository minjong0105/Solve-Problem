#include <iostream>
#include <vector>
using namespace std;

int dx[4] = {1, 1, 0, -1};
int dy[4] = {0, 1, 1, 1};

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<string> v(N);
        for(int i = 0; i < N; i++){
            cin >> v[i];
        }
        bool valid = false;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(v[i][j] == 'o'){
                    for(int d = 0; d < 4; d++){
                        int count = 1;
                        int ni = i, nj = j;
                        for(int k = 0; k < 4; k++){
                            ni += dy[d];
                            nj += dx[d];
                            if(ni >= 0 && nj >= 0 && ni < N && nj < N && v[ni][nj] == 'o'){
                                count++;
                            }else {
                                break;
                            }
                        }
                        if(count >= 5){
                            valid = true;
                            goto here;
                        }
                    }
                }
            }
        }
        here:
        cout << "#" << t << ' ' << (valid ? "YES" : "NO") << '\n';
    }
    return 0;
}