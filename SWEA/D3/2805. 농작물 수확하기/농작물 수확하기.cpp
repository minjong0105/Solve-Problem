#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<string> v(N);
        for(int i = 0; i < N; i++){
            cin >> v[i];
        }

        int sum = 0;

        for(int i = 0; i < N; i++){
            int left = abs(N / 2 - i);
            int right = N - left;
            for(int j = left; j < right; j++){
                sum += v[i][j] - '0';
            }
        }
        cout << "#" << t << ' ' << sum << '\n';
    }
    return 0;
}