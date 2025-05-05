#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<int> num(N);
    for(int i = 0; i < N; i++){
        cin >> num[i];
    }
    sort(num.begin(), num.end());
    cout << num[(N-1) / 2] << endl;
    return 0;
}