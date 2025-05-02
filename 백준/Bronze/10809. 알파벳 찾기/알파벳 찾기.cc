#include <iostream>
#include <string>
#include <array>
using namespace std;

int main(){
    string s;
    array<int, 26> pos;
    pos.fill(-1);
    cin >> s;
    for(int i = 0; i < s.length(); i++){
        int index = s[i] - 'a';
        if(pos[index] == -1){
            pos[index] = i;
        }
    }
    for(int i = 0; i < 26; i++){
        cout << pos[i] << " ";
    }
    return 0;
}