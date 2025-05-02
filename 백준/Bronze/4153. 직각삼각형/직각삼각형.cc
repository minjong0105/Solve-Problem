#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main(){
    while(true){
        int a, b, c;
        cin >> a >> b >> c;
        if(a == 0 && b == 0 && c==0){
            break;
        }
        array<int, 3> side = {a, b, c};
        sort(side.begin(), side.end());
        if(side[0] * side[0] + side[1] * side[1] == side[2] * side[2]){
            cout << "right" << '\n';
        }else{
            cout << "wrong" << '\n';
        }
    }
    return 0;
}