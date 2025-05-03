#include <iostream>
#include <vector>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<int> x(N);
    vector<int> y(N);
    for(int i = 0; i < N; i++){
        cin >> x[i] >> y[i];
    }
    for(int i = 0; i < N; i++){
        int count = 1;
        for(int j = 0; j < N; j++){
            if((x[i] < x[j]) && (y[i] < y[j])){
                count++;
            }
        }
        cout << count << " ";
    }
    return 0;
}