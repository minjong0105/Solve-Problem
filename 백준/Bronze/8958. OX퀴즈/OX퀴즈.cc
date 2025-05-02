#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    while(T--){
        string s;
        cin >> s;
        int sum = 0;
        int score = 0;
        for(char c : s){
            if(c == 'O'){
                score ++;
                sum += score;
            }else{
                score = 0;
            }
        }
        cout << sum << endl;
    }
    return 0;
}