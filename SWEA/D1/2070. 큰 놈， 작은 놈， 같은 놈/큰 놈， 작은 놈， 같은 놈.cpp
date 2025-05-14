#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int x, y;
        cin >> x >> y;
        cout << "#" << t << ' ';
        if(x > y){
            cout << '>' << '\n';
        }else if(x < y){
            cout << '<' << '\n';
        }else{
            cout << '=' << '\n';
        }
    }
    return 0;
}