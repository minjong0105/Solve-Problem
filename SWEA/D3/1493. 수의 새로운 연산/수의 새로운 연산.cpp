#include <iostream>
using namespace std;

pair<int, int> getpos(int num){
    int d = 1;
    while(d * (d + 1) / 2 < num) d++;
    int idx = num - (d * (d - 1) / 2);
    int x = idx;
    int y = d - idx + 1;
    return {x, y};
}

int getnum(int x, int y){
    int idx = x + y - 1;
    return (idx * (idx - 1) / 2 + x);
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int p, q;
        cin >> p >> q;
        pair<int, int> a = getpos(p);
        pair<int, int> b = getpos(q);

        int x = a.first + b.first;
        int y = a.second + b.second;

        int answer = getnum(x, y);

        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}