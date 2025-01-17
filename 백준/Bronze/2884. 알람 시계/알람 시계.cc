#include <iostream>
using namespace std;

int main(){
    int H, M;
    cin >> H >> M;
    if(M >= 45){
        cout << H << " " << M - 45 << endl;
    }
    if(M < 45){
        M += 15;
        if(H == 0){
            H = 23;
        }else{
            H -= 1;
        }
        cout << H << " " << M << endl;
    }
    return 0;
}