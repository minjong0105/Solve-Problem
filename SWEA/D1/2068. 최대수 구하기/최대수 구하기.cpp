#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int max = 0;
        for(int i = 0; i < 10; i++){
            int n;
            cin >> n;
            if(max < n) max = n;
        }
        cout << "#" << t << ' ' << max << '\n';
    }
    return 0;
}