#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int A, B, N;
        cin >> A >> B >> N;

        int count = 0;
        while(true){
            if(A <= B){
                A += B;
                count++;
                if(A > N) break;
            }else{
                B += A;
                count++;
                if(B > N) break;
            }
        }
        cout << count << '\n';
    }
    return 0;
}