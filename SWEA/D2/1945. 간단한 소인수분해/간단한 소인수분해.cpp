#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        int prime[5] = {2, 3, 5, 7, 11};
        int count[5] = {0};
        for(int i = 0; i < 5; i++){
            while(N % prime[i] == 0){
                count[i]++;
                N /= prime[i];
            }
        }
        cout << "#" << t << ' ';
        for(int i = 0; i < 5; i++){
            cout << count[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}