#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<pair<int, int>> pos(N);
    for(int i = 0; i < N; i++){
        cin >> pos[i].first >> pos[i].second;
    }
    sort(pos.begin(), pos.end());

    for(const auto& i : pos){
        cout << i.first << " " << i.second << "\n";
    }
    return 0;
}