#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;

        string max_s = s, min_s = s;
        for(int i = 0; i < s.size(); i++){
            for(int j = i + 1; j < s.size(); j++){
                swap(s[i], s[j]);
                if(s[0] != '0'){
                    if(s > max_s) max_s = s;
                    if(s < min_s) min_s = s;
                }
                swap(s[i], s[j]);
            }
        }
        cout << "#" << t << ' ' << min_s << ' ' << max_s << '\n';
    }
    return 0;
}