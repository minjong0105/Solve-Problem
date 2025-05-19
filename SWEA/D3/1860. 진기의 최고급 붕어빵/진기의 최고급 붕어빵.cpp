#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, M, K;
        cin >> N >> M >> K;
        vector<int> time(N);

        for(int i = 0; i < N; i++){
            cin >> time[i];
        }
        sort(time.begin(), time.end());

        bool possible = true;

        for(int i = 0; i < N; i++){
            int give = time[i] / M * K;
            if(give < i + 1){
                possible = false;
                break;
            }
        }

        cout << "#" << t << ' ' << (possible ? "Possible" : "Impossible" ) << '\n';
    }
    return 0;
}