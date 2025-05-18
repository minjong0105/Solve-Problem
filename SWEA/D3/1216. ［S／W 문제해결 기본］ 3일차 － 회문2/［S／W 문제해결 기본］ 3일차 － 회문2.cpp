#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int test_case;
        cin >> test_case;

        vector<string> v(100);
        for(int i = 0; i < 100; i++){
            cin >> v[i];
        }

        int max_len = 1;
        
        for(int len = 100; len >= 1; len--){
            bool found = false;

            for(int i = 0; i < 100; i++){
                for(int j = 0; j <= 100 - len; j++){
                    bool palin = true;
                    for(int k = 0; k < len / 2; k++){
                        if(v[i][j + k] != v[i][j + len - 1 - k]){
                            palin = false;
                            break;
                        }
                    }
                    if(palin){
                        max_len = len;
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }
            if(found) break;

            for(int i = 0; i < 100; i++){
                for(int j = 0; j <= 100 - len; j++){
                    bool palin = true;
                    for(int k = 0; k < len / 2; k++){
                        if(v[j + k][i] != v[j + len - 1 - k][i]){
                            palin = false;
                            break;
                        }
                    }
                    if(palin){
                        max_len = len;
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }
            if(found) break;
        }
        cout << "#" << test_case << ' ' << max_len << '\n';
    }
    return 0;
}