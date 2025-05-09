#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        int count[8] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int result[8] = {0};
        for(int i = 0; i < 8; i++){
            while(N - count[i] >= 0){
                result[i]++;
                N -= count[i];
            }
        }
        cout << "#" << t <<'\n';
        for(int i = 0; i < 8; i++){
            cout << result[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}