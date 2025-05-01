#include <iostream>
#include <array>
using namespace std;

int main(){
    array<int, 8> num;
    for(int i = 0; i < 8; i++){
        cin >> num[i];
    }

    bool ascending = true;
    bool descending = true;

    for(int i = 0; i < 7; i++){
        if(num[i] < num[i+1]){
            descending = false;
        }else if(num[i] > num[i+1]){
            ascending = false;
        }
    }

    if(ascending){
        cout << "ascending" << endl;
    } else if(descending){
        cout << "descending" << endl;
    }else{
        cout << "mixed" << endl;
    }

}