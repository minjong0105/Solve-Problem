#include <iostream>
using namespace std;

int main(){
    int month[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int count = 0;

        int a, b, x, y;
        cin >> a >> b >> x >> y;

        if(x - a > 0){
            for(int i = a; i < x; i++){
                count += month[i];
            }
            count -= b - 1;
            count += y;
        }
        if(x == a) count += y - b + 1;

        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}