#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int h = 0;
        int m = 0;
        for(int i = 0; i < 2; i++){
            int x, y;
            cin >> x >> y;
            h += x;
            m += y;
        }
        if(m > 60){
            h++;
            m -= 60;
        }
        if(h > 12){
            h -= 12;
        }
        cout << "#" << t << ' ' << h << ' ' << m << '\n';
    }
    return 0;
}