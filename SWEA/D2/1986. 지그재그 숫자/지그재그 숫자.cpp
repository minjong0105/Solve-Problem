#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        int answer = 0;
        for(int i = 1; i <= N; i++){
            if(i % 2 != 0) answer += i;
            if(i % 2 == 0) answer -= i;
        }
        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}