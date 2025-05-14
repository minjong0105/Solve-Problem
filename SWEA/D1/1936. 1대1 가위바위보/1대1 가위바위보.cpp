#include <iostream>
using namespace std;

int main(){
    int A, B;
    cin >> A >> B;
    if(A == 1){
        if(B == 2) cout << "B";
        if(B == 3) cout << "A";
    }else if(A == 2){
        if(B == 1) cout << "A";
        if(B == 3) cout << "B";
    }else{
        if(B == 1) cout << "B";
        if(B == 2) cout << "A";
    }
}