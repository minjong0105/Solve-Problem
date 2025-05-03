#include <iostream>
#include <string>
using namespace std;

int main(){
    int n;
    cin >> n;
    int i = 0;
    int num = 666;
    while(true){
        if(to_string(num).find("666") != string::npos){
            i++;
            if(i == n){
                cout << num << endl;
                break;
            }
        }num++;
    }
    return 0;
}