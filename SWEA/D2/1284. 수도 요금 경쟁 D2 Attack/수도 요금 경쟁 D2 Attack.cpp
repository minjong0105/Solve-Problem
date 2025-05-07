#include <iostream>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int P, Q, R, S, W;
        cin >> P >> Q >> R >> S >> W;
        int A = P * W;
        int B;
        if(W <= R){
            B = Q;
        }else{
            B = Q + ((W - R) * S);
        }
        int ans;
        if(A <= B) ans = A;
        else ans = B;
        cout << "#" << t << " " << ans << '\n';
    }
    return 0;
}