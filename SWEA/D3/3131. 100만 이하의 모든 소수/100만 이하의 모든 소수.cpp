#include <iostream>
#include <vector>
using namespace std;


int main(){
    int MAX = 1000000;

    vector<bool> prime(MAX + 1, true);
    prime[0] = false, prime[1] = false;

    for(int i = 2; i * i <= MAX; i++){
        if(prime[i]){
            for(int j = i * i; j <= MAX; j += i){
                prime[j] = false;
            }
        }
    }

    for(int i = 2; i <= MAX; i++){
        if(prime[i]) cout << i << ' ';
    }
    return 0;
}