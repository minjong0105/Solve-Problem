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
    sort(pos.begin(), pos.end(), [](const pair<int, int>& a, const pair<int, int>& b){
        if(a.second == b.second){
            return a.first < b.first;
        };
        return a.second < b.second;
    });
    for(const auto& i : pos){
        cout << i.first << " " << i.second << "\n";
    }
    return 0;
}