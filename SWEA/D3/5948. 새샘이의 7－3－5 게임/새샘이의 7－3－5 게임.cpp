#include <iostream>
#include <set>
using namespace std;

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        int arr[7];
        for(int i = 0; i < 7; i++){
            cin >> arr[i];
        }
        set<int, greater<int>> set_sum;
        for(int i = 0; i < 7; i++){
            for(int j = i + 1; j < 7; j++){
                for(int k = j + 1; k < 7; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    set_sum.insert(sum);
                }
            }
        }
        int count = 0, answer;
        for(int i : set_sum){
            count++;
            if(count == 5){
                answer = i;
                break;
            }
        }
        cout << "#" << t << ' ' << answer << '\n';
    }
    return 0;
}