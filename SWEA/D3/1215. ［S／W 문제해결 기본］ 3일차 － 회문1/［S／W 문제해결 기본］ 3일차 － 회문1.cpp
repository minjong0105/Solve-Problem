#include <iostream>
#include <vector>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        vector<string> v(8);
        for(int i = 0; i < 8; i++){
            cin >> v[i];
        }
        
        int sum = 0;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j <= 8 - N; j++){
                bool is_palin = true;
                for(int k = 0; k < N / 2; k++){
                    if(v[i][j + k] != v[i][j + N - 1 - k]){
                        is_palin = false;
                        break;
                    }
                }
                if(is_palin) sum ++;
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j <= 8 - N; j++){
                bool is_palin = true;
                for(int k = 0; k < N / 2; k++){
                    if(v[j + k][i] != v[j + N - 1 - k][i]){
                        is_palin = false;
                        break;
                    }
                }
                if(is_palin) sum ++;
            }
        }
        cout << "#" << t << ' ' << sum << '\n';
    }
    return 0;
}