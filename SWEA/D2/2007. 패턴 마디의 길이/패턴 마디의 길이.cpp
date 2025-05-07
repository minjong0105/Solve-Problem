#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;
        int answer;
        for(int i = 1; i <= 10; i++){
            string re = s.substr(0, i);
            string str = "";
            
            while(str.length() < s.length()){
                str += re;
            }
            if(str.substr(0, s.length()) == s){
                answer = i;
                break;
            }
        }
        cout << "#" << t << " " << answer << '\n';
    }
    return 0;
}