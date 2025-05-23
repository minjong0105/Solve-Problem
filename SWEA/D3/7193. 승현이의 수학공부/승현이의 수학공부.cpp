#include <iostream>
#include <string>
using namespace std;

int main() {
    int T;
    cin >> T;
    for (int t = 1; t <= T; t++) {
        int N;
        string X;
        cin >> N >> X;

        int sum = 0;
        for (char c : X) {
            sum += c - '0';
        }
        cout << "#" << t << ' ' << sum % (N - 1) << '\n';
    }
    return 0;
}