#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    while(T--){
        string S;
        int R;
        cin >> R >> S;
        for(char c : S){
            for(int i = 0; i < R; i++){
                cout << c;
            }
        }
        cout << '\n';
    }
    return 0;
}