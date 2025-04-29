#include <iostream>
using namespace std;

int main(){
    int A, B, C;
    cin >> A >> B >> C;
    int num = A * B * C;
    int count[10] = {0};
    
    while(num > 0){
        int digit = num % 10;
        count[digit]++;
        num /= 10;
    }

    for(int i = 0; i < 10; i++){
        cout << count[i] << endl;
    }
}