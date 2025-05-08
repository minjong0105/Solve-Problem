#include <iostream>
#include <vector>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int T;
        cin >> T;
        vector<vector<int>> v(100, vector<int>(100));
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                cin >> v[i][j];
            }
        }

        int max = 0;
        for(int i = 0; i < 100; i++){
            int sum = 0;
            for(int j = 0; j < 100; j++){
                sum += v[i][j];
            }
            if(max < sum) max = sum;
        }

        for(int i = 0; i < 100; i++){
            int sum = 0;
            for(int j = 0; j < 100; j++){
                sum += v[j][i];
            }
            if(max < sum) max = sum;
        }
        
        int sum1 = 0;
        for(int i = 0; i < 100; i++){
            sum1 += v[i][i];
        }
        if(max < sum1) max = sum1;

        int sum2 = 0;
        for(int i = 0; i < 100; i++){
            sum2 += v[99 - i][i];
        }
        if(max < sum2) max = sum2;
        
        cout << "#" << t << ' ' << max << '\n';
    }
    return 0;
}