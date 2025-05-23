#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, D;
        cin >> N >> D;

        int answer = N / (2 * D + 1);
        if(N % (2 * D + 1) != 0) answer++;

        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}