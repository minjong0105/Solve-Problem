#include <iostream>
#include <vector>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;

        vector<int> origin(N);
        for(int i = 0; i < N; i++){
            cin >> origin[i];
        }
        int cmd_num;
        cin >> cmd_num;
        for(int i = 0; i < cmd_num; i++){
            char c;
            int x, y;
            cin >> c >> x >> y;
            vector<int> put_num(y);
            for(int j = 0; j < y; j++){
                cin >> put_num[j];
            }
            origin.insert(origin.begin() + x, put_num.begin(), put_num.end());
        }
        cout << "#" << t << ' ';
        for(int j = 0; j < 10; j++){
            cout << origin[j] << ' ';
        }
        cout << '\n';
    }
    return 0;
}