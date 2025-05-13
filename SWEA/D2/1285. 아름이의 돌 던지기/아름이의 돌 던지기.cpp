#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        int count = 0;
        int distance = 100000;
        for(int i = 0; i < N; i++){
            int num;
            cin >> num;
            if(abs(num) < distance) {
                distance = abs(num);
                count = 1;
            }else if(abs(num) == distance) {
                count++;
            }
        }
        cout << "#" << t << ' ' << distance << ' ' << count << '\n';
    }
    return 0;
}