#include <iostream>
#include <string>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        string s;
        cin >> N >> s;

        string pw;
        for(char c : s){
            if(!pw.empty() && pw.back() == c){
                pw.pop_back();
            }else{
                pw.push_back(c);
            }
        }
        cout << "#" << t << ' ' << pw << '\n';
    }
    return 0;
}