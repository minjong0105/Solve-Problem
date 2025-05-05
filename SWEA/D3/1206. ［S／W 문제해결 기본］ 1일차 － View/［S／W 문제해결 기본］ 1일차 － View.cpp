#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int N;
        cin >> N;
        vector<int> building(N);
        for(int i = 0; i < N; i++){
            cin >> building[i];
        }
        int count = 0;
        for(int i = 2; i < N - 2; i++){
            int left_floor = max(building[i-2], building[i-1]);
            int right_floor = max(building[i+1], building[i+2]);
            int max_floor = max(left_floor, right_floor);
            if(max_floor < building[i]){
                count += building[i] - max_floor;
            }
        }
        cout << "#" << t << " " << count << '\n';
    }
    return 0;
}