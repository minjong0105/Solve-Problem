#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int x;
            cin >> x;
            sum += x;
        }
        int avg = round(sum / 10.0);
        cout << "#" << t << " " << avg << "\n";
    }
    return 0;
}