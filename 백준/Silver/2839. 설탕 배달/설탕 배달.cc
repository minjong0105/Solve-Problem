#include <iostream>
using namespace std;

int main(){
    int N;
    cin >> N;

    int five, three;
    five = N / 5;
    int i = 0;
    while(five >= 0){
        three = ((N % 5) +i) / 3;
        if(((N % 5) + i) % 3 == 0){
            cout << five + three << endl;
            return 0;
        }
        five -= 1;
        i += 5;
        
    }
    cout << "-1" << endl;
    return 0;
}