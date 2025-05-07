#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int T;
    cin >> T;
    vector<string> grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D"};
    for(int t = 1; t <= T; t++){
        int N, K;
        cin >> N >> K;
        vector<pair<double, int>> v(N);
        for(int i = 0; i < N; i++){
            int mid, final, report;
            cin >> mid >> final >> report;
            double score = (mid * 0.35) + (final * 0.45) + (report * 0.2);
            v[i].first = score; 
            v[i].second = i;
        }

        sort(v.begin(), v.end(), greater<>());
        int rank;
        for(int i = 0; i < N; i++){
            if(v[i].second == K - 1){
                rank = i;
                break;
            }
        }
        int idx = rank / (N / 10);

        cout << "#" << t << ' ' << grades[idx] << '\n';
    }
    return 0;
}