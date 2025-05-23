#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int N, M;
		cin >> N >> M;

		vector<int> weight(N);

		for (int i = 0; i < N; i++) {
			cin >> weight[i];
		}

		int answer = -1;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = weight[i] + weight[j];
				if (sum <= M) {
					answer = max(answer, sum);
				}
			}
		}
		cout << "#" << t << ' ' << answer << '\n';
	}
	return 0;
}