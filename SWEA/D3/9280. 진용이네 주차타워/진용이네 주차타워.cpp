#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int n, m;
        cin >> n >> m;

        vector<int> R(n);
        for(int i = 0; i < n; i++){
            cin >> R[i];
        }

        vector<int> W(m + 1);
        for(int i = 1; i <= m; i++){
            cin >> W[i];
        }

        int total = 0;
        vector<int> parking(n, 0);
        queue<int> wait;

        for(int i = 0; i < 2 * m; i++){
            int car;
            cin >> car;

            if(car > 0){
                bool parked = false;
                for(int j = 0; j < n; j++){
                    if(parking[j] == 0){
                        parking[j] = car;
                        total += W[car] * R[j];
                        parked = true;
                        break;
                    }
                }if(!parked) wait.push(car);
            }else{
                car = -car;
                for(int j = 0; j < n; j++){
                    if(parking[j] == car){
                        parking[j] = 0;

                        if(!wait.empty()){
                            int x = wait.front();
                            wait.pop();
                            parking[j] = x;
                            total += W[x] * R[j];
                        }
                        break;
                    }
                }
            }
        }
        cout << "#" << t << ' ' << total << '\n';
    }
    return 0;
}