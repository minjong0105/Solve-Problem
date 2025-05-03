#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<pair<int, string>> info(N);
    for(int i = 0; i < N; i++){
        cin >> info[i].first >> info[i].second;
    }

    stable_sort(info.begin(), info.end(), [](const pair<int, string>& a, const pair<int, string>& b){
        return a.first < b.first;
    });

    for(const auto& i : info){
        cout << i.first << " " << i.second << "\n";
    }
    return 0;
}