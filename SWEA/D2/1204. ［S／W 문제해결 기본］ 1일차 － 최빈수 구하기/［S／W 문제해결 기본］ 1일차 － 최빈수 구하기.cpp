#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    while(T--){
        int c;
        cin >> c;
        cout << "#" << c << " ";
        vector<int> score(101, 0);
        for(int i = 0; i < 1000; i++){
            int x;
            cin >> x;
            score[x]++;
        }
        int max_count = 0;
        int max_score = 0;
        for(int i = 0; i < 101; i++){
            if(score[i] >= max_count){
                max_count = score[i];
                max_score = i;
            }
        }
        cout << max_score << "\n";
    }
    return 0;
}