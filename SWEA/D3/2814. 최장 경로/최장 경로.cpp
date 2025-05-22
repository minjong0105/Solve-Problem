#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int N, M, max_length;
vector<vector<int>> graph;
vector<bool> visited;
void dfs(int node, int length){
    max_length = max(max_length, length);

    for(int next : graph[node]){
        if(!visited[next]){
            visited[next] = true;
            dfs(next, length + 1);
            visited[next] = false;
        }
    }
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        cin >> N >> M;
        graph.assign(N + 1, vector<int>());
        visited.assign(N + 1, false);
        max_length = 0;

        for(int i = 0 ; i < M; i++){
            int x, y;
            cin >> x >> y;
            graph[x].push_back(y);
            graph[y].push_back(x);
        }
        for(int i = 1; i <= N; i++){
            visited[i] = true;
            dfs(i, 1);
            visited[i] = false;
        }
        cout << "#" << t << ' ' << max_length << '\n';
    }
    return 0;
}