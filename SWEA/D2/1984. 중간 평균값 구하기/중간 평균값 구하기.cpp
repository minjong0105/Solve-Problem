#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int sum = 0;
        int max = 0;
        int min = 10000;
        for(int i = 0; i < 10; i++){
            int num;
            cin >> num;
            sum += num;
            if(max < num) max = num;
            if(min > num) min = num;
        }
        sum -=  min + max;
        cout << "#" << t << ' ' << round(sum / 8.0) << '\n';
    }
    return 0;
}