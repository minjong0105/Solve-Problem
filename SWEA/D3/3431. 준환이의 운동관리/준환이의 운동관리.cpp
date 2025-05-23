#include <iostream>
using namespace std;

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int L, U, X;
		cin >> L >> U >> X;

		int answer = 0;

		if (X < L) {
			answer = L - X;
		}
		if (X > U) {
			answer = -1;
		}
		cout << "#" << t << ' ' << answer << '\n';
	}
	return 0;
}