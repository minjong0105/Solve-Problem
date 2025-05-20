#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

unordered_map<string, int> code_map = {
    {"0001101", 0}, {"0011001", 1}, {"0010011", 2}, {"0111101", 3}, {"0100011", 4},
    {"0110001", 5}, {"0101111", 6}, {"0111011", 7}, {"0110111", 8}, {"0001011", 9}
};

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int N, M;
        cin >> N >> M;
        string s, info;
        for(int i = 0; i < N; i++){
            cin >> s;
            if(s.find('1') != string::npos){
                info = s;
            }
        }
        int end = info.find_last_of('1');
        string d = info.substr(end - 55, 56);

        vector<int> v;
        for(int i = 0; i < 56; i+= 7){
            string x = d.substr(i, 7);
            v.push_back(code_map[x]);
        }
        int odd = v[0] + v[2] + v[4] + v[6];
        int even = v[1] + v[3] + v[5] + v[7];
        int num = odd * 3 + even;
        cout << "#" << t << ' ';
        if(num % 10 == 0) cout << odd + even << '\n';
        else cout << 0 << '\n';
    }
    return 0;
}