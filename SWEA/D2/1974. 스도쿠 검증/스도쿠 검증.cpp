#include <iostream>
#include <vector>
using namespace std;

bool valid(const vector<vector<int>>& v){
    for(int x = 0; x < 9; x++){
        vector<int> count(10, 0);
        for(int y = 0; y < 9; y++){
            if(++count[v[x][y]] > 1) return false;
        }
    }

    for(int y = 0; y < 9; y++){
        vector<int> count(10, 0);
        for(int x = 0; x < 9; x++){
            if(++count[v[x][y]] > 1) return false;
        }
    }

    for(int x = 0; x < 9; x += 3){
        for(int y = 0; y < 9; y += 3){
            vector<int> count (10, 0);
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(++count[v[i][j]] > 1) return false;
                }
            }
        }
    }
    return true;
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        vector<vector<int>> v(9, vector<int>(9));
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                cin >> v[i][j];
            }
        }
        int result;
        if(valid(v)){
            result = 1;
        }else result = 0;
        cout << "#" << t << " " << result << '\n';
    }
    return 0;
}