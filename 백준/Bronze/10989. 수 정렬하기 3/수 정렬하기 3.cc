#include <iostream>
#include <array>
using namespace std;

int main(){
    int N;
    cin >> N;
    array<int, 10001> num = {0};
    for(int i = 0; i < N; i++){
        int n;
        cin >> n;
        num[n] ++;
    }
    for(int i = 0; i < 10001; i++){
        while(num[i]--)
            cout << i << '\n';
    }
    return 0;
}