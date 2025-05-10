#include <iostream>
#include <vector>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        vector<vector<int>> v(100, vector<int>(N));

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                cin >> v[i][j];
            }
        }
        int count = 0;
        for(int i = 0; i < 100; i++){
            bool have_N = false;
            for(int j = 0; j < 100; j++){
                if(v[j][i] == 1){
                    have_N = true;
                }else if(v[j][i] == 2){
                    if(have_N){
                        count++;
                        have_N = false;
                    }
                }
            }
        }
        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}