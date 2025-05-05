#include <iostream>
#include <unordered_map>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int N, M;
    cin >> N;
    unordered_map<int, int> count;
    for(int i = 0; i < N; i++){
        int num;
        cin >> num;
        count[num]++;
    }

    cin >> M;
    for(int i = 0; i < M; i++){
        int num;
        cin >> num;
        cout << count[num] << " ";
    }
    return 0;
}