#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;

        vector<int> v;
        for(char c : s){
            int val;
            if('A' <= c && c <= 'Z') val = c - 'A';
            else if('a' <= c && c <= 'z') val = c - 'a' + 26;
            else if('0' <= c && c <= '9') val = c - '0' + 52;
            else if(c == '+') val = 62;
            else if(c == '/') val = 63;
            v.push_back(val);
        }

        cout << "#" << t << ' ';
        for(int i = 0; i < v.size(); i += 4){
            int bits = 0;
            for(int j = 0; j < 4; j++){
                bits = (bits << 6) | v[i + j];
            }
            char c1 = (bits >> 16) & 0xFF;
            char c2 = (bits >> 8) & 0xFF;
            char c3 = (bits >> 0) & 0xFF;
            cout << c1 << c2 << c3;
        }
        cout << '\n';
    }
    return 0;
}