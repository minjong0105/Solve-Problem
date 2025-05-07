#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;
        bool valid = true;
        for(int i = 0; i < s.length()/2; i++){
            if(s[i] != s[s.length() - 1 - i]){
                valid = false;
                break;
            }
        }
        int ans = valid ? 1 : 0;
        cout << "#" << t << " " << ans << '\n';
    }
    return 0;
}