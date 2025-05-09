#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;
        int count = 0;
        if(s[0] == '1') count++;
        for(int i = 0; i < s.length() - 1; i++){
            if(s[i] != s[i + 1]) count++;
        }
        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}