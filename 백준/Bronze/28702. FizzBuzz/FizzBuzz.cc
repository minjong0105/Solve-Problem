#include <iostream>
#include <string>
using namespace std;

int main(){
    string s[3];
    for(int i = 0; i < 3; i++){
        cin >> s[i];
    }
    int n = 0;
    int index = 0;
    for(int i = 0; i < 3; i++){
        try{
            n = stoi(s[i]);
            index = i;
            break;
        }catch(...){
        }
    }
    int i = n + (3 - index);
    if(i % 3 == 0 && i % 5 == 0){
        cout << "FizzBuzz" << endl;
    }else if(i % 3 == 0){
        cout << "Fizz" << endl;
    }else if(i % 5 == 0){
        cout << "Buzz" << endl;
    }else {
        cout << i << endl;
    }
    return 0;
}