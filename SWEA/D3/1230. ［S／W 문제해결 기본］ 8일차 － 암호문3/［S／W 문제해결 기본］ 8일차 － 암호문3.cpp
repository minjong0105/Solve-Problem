#include <iostream>
#include <vector>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        vector<int> origin(N);
        for(int i = 0; i < N; i++){
            cin >> origin[i];
        }
        int M;
        cin >> M;
        for(int i = 0; i < M; i++){
            char c;
            cin >> c;
            if(c == 'I'){
                int x, y;
                cin >> x >> y;
                vector<int> insert_num(y);
                for(int j = 0; j < y; j++){
                    cin >> insert_num[j];
                }
                origin.insert(origin.begin() + x, insert_num.begin(), insert_num.end());
            }else if(c == 'D'){
                int x, y;
                cin >> x >> y;
                origin.erase(origin.begin() + x, origin.begin() + x + y);
            }else if(c == 'A'){
                int y;
                cin >> y;
                for(int j = 0; j < y; j++){
                    int s;
                    cin >> s;
                    origin.push_back(s);
                }
            }
        }
        cout << "#" << t << ' ';
        for(int i = 0; i < 10; i++){
            cout << origin[i] << ' ';
        }
        cout << '\n';
    }
    return 0;
}