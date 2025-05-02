#include <iostream>
using namespace std;

int main(){
    int a, b;
    cin >> a >> b;

    int A = a;
    int B = b;
    while(B != 0){
        int C = A % B;
        A = B;
        B = C;
    }
    int max = A;
    int min = a * b / max;
    cout << max << '\n' << min << endl;
    return 0;
}