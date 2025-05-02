#include <iostream>
#include <array>
using namespace std;

int main(){
    int N, T, P;
    array<int, 6> Tsize;
    cin >> N;
    for(int i = 0; i < 6; i++){
        cin >> Tsize[i];
    }
    cin >> T >> P;

    int set = 0;
    for(int i = 0; i < 6; i++){
        set += Tsize[i] / T;
        if(Tsize[i] % T != 0) set += 1; 
    }
    cout << set << '\n';
    cout << N / P << " " << N % P << endl;
    return 0;
}