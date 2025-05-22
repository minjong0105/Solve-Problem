#include <iostream>
#include <vector>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;

        vector<string> name(N);
        for(int i = 0; i < N; i++){
            cin >> name[i];
        }

        int half = (N + 1) / 2;
        vector<string> first_half(name.begin(), name.begin() + half);
        vector<string> second_half(name.begin() + half, name.end());

        cout << "#" << t << ' ';
        for(int i = 0; i < half; i++){
            cout << first_half[i] << ' ';
            if(i < second_half.size()){
                cout << second_half[i] << ' ';
            }
        }
        cout << '\n';
    }
    return 0;
}