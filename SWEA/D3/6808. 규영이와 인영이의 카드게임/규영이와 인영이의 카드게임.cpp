#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int G[9];
        bool used[19] = {false};

        for(int i = 0; i < 9; i++){
            cin >> G[i];
            used[G[i]] = true;
        }

        int I[9];
        int idx = 0;
        for(int i = 1; i <= 18; i++){
            if(!used[i]){
                I[idx] = i;
                idx++;
            }
        }
        
        int win = 0, lose = 0;

        sort(I, I + 9);

        do{
            int g_score = 0, i_score = 0;
            for(int i = 0; i < 9; i++){
                if(G[i] > I[i]) g_score += G[i] + I[i];
                else i_score += G[i] + I[i];
            }
            if(g_score > i_score) win++;
            else if(g_score < i_score) lose++;
        }while(next_permutation(I, I + 9));
        cout << "#" << t << ' ' << win << ' ' << lose << '\n';
    }
    return 0;
}