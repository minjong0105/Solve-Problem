#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        vector<int> found(10, 0);
        int answer = 0;
        int count = 0;
        while(count < 10){
            answer += N;
            int num = answer;
            while(num > 0){
                if(found[num % 10] == 0) {
                    count++;
                    found[num % 10]++;
                }
                num /= 10;
            }
        }
        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}