#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int layer = 1;
    int maxNum = 1;

    while (N > maxNum) {
        maxNum += 6 * layer;
        layer++;
    }

    cout << layer << '\n';
    return 0;
}