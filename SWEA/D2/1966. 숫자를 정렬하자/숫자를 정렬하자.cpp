#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        vector<int> v(N);
        for(int i = 0; i < N; i++){
            cin >> v[i];
        }
        sort(v.begin(), v.end());

        cout << "#" << t << ' ';
        for(int i = 0; i < N; i++){
            cout << v[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}