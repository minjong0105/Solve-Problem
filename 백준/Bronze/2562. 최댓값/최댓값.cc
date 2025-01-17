#include <iostream>
using namespace std;

int main(){
    int arr[9];
    int maxnum = 0;
    int maxindex = 0;
    for(int i = 0; i < 9; i++){
        cin >> arr[i];
        if(arr[i] > maxnum){
            maxnum = arr[i];
            maxindex = i + 1;
        }
    }
    cout << maxnum << "\n" << maxindex << endl;
    return 0;
}