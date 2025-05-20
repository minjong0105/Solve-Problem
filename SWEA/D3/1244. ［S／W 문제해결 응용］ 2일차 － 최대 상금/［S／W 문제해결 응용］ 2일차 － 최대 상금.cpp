#include <iostream>
#include <string>
#include <set>
using namespace std;

string max_value;
int max_swaps;
set<pair<string, int>> visited;

void dfs(string now, int swaps){
    if(swaps == max_swaps){
        if(now > max_value){
            max_value = now;
        }
        return;
    }
    if(visited.count({now, swaps})) return;
    visited.insert({now, swaps});

    for(int i = 0; i < now.size() - 1; i++){
        for(int j = i + 1; j < now.size(); j++){
            swap(now[i], now[j]);
            dfs(now, swaps + 1);
            swap(now[i], now[j]);
        }
    }
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string n;
        cin >> n >> max_swaps;
        max_value = "0";
        visited.clear();
        dfs(n, 0);
        cout << "#" << t << ' ' << max_value << '\n';
    }
    return 0;
}