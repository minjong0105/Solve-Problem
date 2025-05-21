#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int n;
        cin >> n;
        int a[7];
        for(int i = 0; i < 7; i++){
            cin >> a[i];
        }
        int answer = 1e9;

        for(int i = 0; i < 7; i++){
            if(a[i] == 0) continue;
            int count = 0, day = 0;

            for(int j = i; ; j = (j + 1) % 7){
                day++;
                if(a[j] == 1) count++;
                if(count == n) break;
            }
            answer = min(answer, day);
        }

        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}