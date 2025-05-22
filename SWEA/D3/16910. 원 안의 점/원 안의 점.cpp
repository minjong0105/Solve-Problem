#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;

        int count = 0;

        for(int i = -N; i <= N; i++){
            for(int j = -N; j <= N; j++){
                if(i * i + j * j <= N * N) count++;
            }
        }
        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}