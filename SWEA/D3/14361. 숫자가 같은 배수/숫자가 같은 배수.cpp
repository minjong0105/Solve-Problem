#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

bool check(string i, string j){
    sort(i.begin(), i.end());
    sort(j.begin(), j.end());

    return i == j;
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        string origin = to_string(N);

        bool found = false;

        for(int i = 2; i <= 9; i++){
            int multi = N * i;
            if(check(origin, to_string(multi))){
                found = true;
                break;
            }
        }
        cout << "#" << t << ' ' << (found ? "possible" : "impossible") << '\n';
    }
    return 0;
}