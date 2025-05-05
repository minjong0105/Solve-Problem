#include <iostream>
#include <vector>
using namespace std;

int main(){
    int K;
    cin >> K;
    vector<int> num;
    for(int i = 0; i < K; i++){
        int a;
        cin >> a;
        if(a == 0 && !num.empty()){
            num.pop_back();
        }else{
            num.push_back(a);
        }
    }
    int sum = 0;
    for(int i = 0; i < num.size(); i++){
        sum += num[i];
    }
    cout << sum << endl;
    return 0;
}