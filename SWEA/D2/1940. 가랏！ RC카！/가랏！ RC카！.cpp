#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        int speed = 0;
        int meter = 0;
        for(int i = 0; i < N; i++){
            int cmd;
            cin >> cmd;
            if(cmd == 1){
                int acc;
                cin >> acc;
                speed += acc;
            }else if(cmd == 2){
                int dec;
                cin >> dec;
                speed -= dec;
                if(speed < 0) speed = 0;
            }
            meter += speed;
        }
        cout << "#" << t << ' ' << meter << '\n';
    }
    return 0;
}