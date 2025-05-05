#include <iostream>
#include <vector>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int M, N;
    cin >> M >> N;
    vector<bool> prime(N + 1, true);
    prime[0] = prime[1] = false;
    for(int i = 2; i * i <= N; i++){
        if(prime[i]){
            for(int j = i * i; j <= N; j += i){
                prime[j] = false;
            }
        }
    }
    for(int i = M; i <= N; i++){
        if(prime[i]){
            cout << i << "\n";
        }
    }
    return 0;
}