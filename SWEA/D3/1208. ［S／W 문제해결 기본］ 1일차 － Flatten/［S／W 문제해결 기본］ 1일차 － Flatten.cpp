#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int dump;
        cin >> dump;
        vector<int> box(100);
        for(int i = 0; i < 100; i++){
            cin >> box[i];
        }
        while(dump--){
            auto max_ele = max_element(box.begin(), box.end());
            auto min_ele = min_element(box.begin(), box.end());
            (*max_ele)--;
            (*min_ele)++;
        }
        auto max_height = *max_element(box.begin(), box.end());
        auto min_height = *min_element(box.begin(), box.end());

        cout << "#" << t << " " << max_height - min_height << '\n';
    }
    return 0;
}