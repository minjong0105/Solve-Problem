#include <iostream>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int test_case;
        cin >> test_case;
        int N, M;
        cin >> N >> M;
        int result = 1;
        for(int i = 0; i < M; i++){
            result *= N;
        }
        cout << "#" << t << ' ' << result << '\n';
    }
    return 0;
}