#include <iostream>
#include <string>
using namespace std;

int main(){
    int N;
    cin >> N;
    for(int i = 1; i <= N; i++){
        string s = to_string(i);
        int count = 0;
        for(char c : s){
            if(c == '3' || c == '6' || c == '9'){
                count++;
            }
        }
        if(count > 0){
            for(int j = 0; j < count; j++){
                cout << "-";
            }
        }else{
            cout << i;
        }
        cout << " ";
    }
    return 0;
}