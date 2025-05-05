#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int N;
    cin >> N;
    vector<int> A(N);
    for(int i = 0; i < N; i++){
        cin >> A[i];
    }
    sort(A.begin(), A.end());
    int M;
    cin >> M;
    while(M--){
        int i;
        cin >> i;
        if(binary_search(A.begin(), A.end(), i)){
            cout << "1\n";
        }else{
            cout << "0\n";
        }
    }
    return 0;
}