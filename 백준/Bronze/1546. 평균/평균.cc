#include <iostream>
#include <vector>
using namespace std;

int main(){
    int N;
    cin >> N;
    vector<double> scores(N);
    double max = 0;
    for(int i = 0; i < N; i++){
        cin >> scores[i];
        if(scores[i] > max)
            max = scores[i];
    }

    double sum = 0;
    for(int i = 0; i < N; i++){
        scores[i] = (scores[i] / max) * 100;
        sum += scores[i];
    }
    cout << sum / N << endl;
    return 0;
}