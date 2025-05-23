#include <iostream>
#include <vector>
using namespace std;

int main() {
	vector<int> radius(10);
	for (int i = 0; i < 10; i++) {
		int r = 20 * (i + 1);
		radius[i] = r * r;
	}

	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int N;
		cin >> N;

		int answer = 0;

		for (int i = 0; i < N; i++) {
			int x, y;
			cin >> x >> y;
			int len = x * x + y * y;
			
			for (int j = 0; j < 10; j++) {
				if (len <= radius[j]) {
					answer += 10 - j;
					break;
				}
			}
		}
		cout << "#" << t << ' ' << answer << '\n';
	}
	return 0;
}