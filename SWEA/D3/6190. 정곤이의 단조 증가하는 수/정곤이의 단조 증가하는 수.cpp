#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


bool check(int num){
    int prev = 10;
    
    while(num > 0){
        int x = num % 10;
        if(x > prev) return false;
        prev = x;
        num /= 10;
    }
    return true;
}

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        
        vector<int> num(N);
        for(int i = 0; i < N; i++){
            cin >> num[i];
        }

        int answer = -1;

        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                int x = num[i] * num[j];
                if(check(x)){
                    answer = max(answer, x);
                }
            }
        }
        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}