#include <iostream>
using namespace std;

int main() {

	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int D, H, M;
		cin >> D >> H >> M;

		int base = 11 * 24 * 60 + 11 * 60 + 11;
		int now = D * 24 * 60 + H * 60 + M;
		int answer = now - base;

		if (answer < 0) answer = -1;

		cout << "#" << t << ' ' << answer << '\n';
	}
	return 0;
}