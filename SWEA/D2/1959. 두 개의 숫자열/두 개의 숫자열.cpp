#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, M;
        cin >> N >> M;
        vector<int> A(N);
        for(int i = 0; i < N; i++){
            cin >> A[i];
        }

        vector<int> B(M);
        for(int j = 0; j < M; j++){
            cin >> B[j];
        }
        
        int max = 0;
        
        if(N == M){
            int sum = 0;
            for(int i = 0; i < N; i++){
                sum += A[i] * B[i];
            }
            max = sum;
        }
        
        if(N < M){
            for(int i = 0; i < M - N + 1; i++){
            int sum = 0;
                for(int j = 0; j < N; j++){
                    sum += A[j] * B[j + i];
                }
                if(max < sum) max = sum; 
            }
        }
        if(N > M){
            for(int i = 0; i < N - M + 1; i++){
            int sum = 0;
                for(int j = 0; j < M; j++){
                    sum += A[j + i] * B[j];
                }
                if(max < sum) max = sum; 
            }
        }
        cout << "#" << t << ' ' << max << '\n';
    }
    return 0;
}