#include <iostream>
#include <string>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N;
        cin >> N;
        cout << "#" << t << '\n';

        string result = "";

        for(int i = 0; i < N; i++){
            string s;
            int num;
            cin >> s >> num;
            for(int j = 0; j < num; j++){
                result += s;
            }
        }
        for(int i = 0; i <= result.length(); i++){
            cout << result[i];
            if((i + 1) % 10 == 0) cout << '\n';
        }
        if(result.length() % 10 != 0) cout << '\n';
    }
    return 0;
}