#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, K;
        cin >> N >> K;
        
        vector<int> people(N + 1, 0);
        for(int i = 1; i <= N; i++){
            people[i] = 1;
        }

        for(int i = 0; i < K; i++){
            int x;
            cin >> x;
            people[x] = 0;
        }
        cout << "#" << t << ' ';
        for(int i = 1; i <= N; i++){
            if(people[i] != 0) cout << i << ' ';
        }
        cout << '\n';
    }
    return 0;
}