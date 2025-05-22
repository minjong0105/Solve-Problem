#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, Q;
        cin >> N >> Q;

        vector<int> box(N + 1, 0);

        for(int i = 1; i <= Q; i++){
            int L, R;
            cin >> L >> R;
            for(int j = L; j <= R; j++){
                box[j] = i;
            }
        }
        cout << "#" << t << ' ';

        for(int i = 1; i <= N; i++){
            cout << box[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}