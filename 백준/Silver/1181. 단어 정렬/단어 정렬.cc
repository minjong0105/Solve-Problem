#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<string> s(N);
    for(int i = 0; i < N; i++){
        cin >> s[i];
    }
    sort(s.begin(), s.end(), [](const string &a, const string &b){
        if(a.length() == b.length()){
            return a < b;
        }
        return a.length() < b.length();
    });
    s.erase(unique(s.begin(), s.end()), s.end());

    for(const string &str: s){
        cout << str << '\n';
    }
    return 0;
}