#include <iostream>
#include <string>
using namespace std;

int main(){
    string s;
    while(true){
        cin >> s;
        if(s == "0") break;

        bool palindrome = true;
        for(int i = 0; i < s.length() / 2; i++){
            if(s[i] != s[s.length() - i -1]){
                palindrome = false;
                break;
            }
        }
        if(palindrome)
            cout << "yes" << '\n';
        else
            cout << "no" << '\n';
    }
    return 0;
}