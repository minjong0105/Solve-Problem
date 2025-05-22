#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;

        int count = 1;
        int start = 1, end = 1, sum = 1;
        while(start <= N / 2){
            if(sum < N){
                end++;
                sum += end;
            }else if(sum > N){
                sum -= start;
                start++;
            }else{
                count++;
                sum -= start;
                start++;
            }
        }
        cout << "#" << t << ' ' << count << '\n';
    }
    return 0;
}