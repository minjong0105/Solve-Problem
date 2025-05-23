#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		string x, y;
		cin >> x >> y;

		int count = 0;

		vector<vector<int>> dp(x.size() + 1, vector<int>(y.length() + 1, 0));

		
		for (int i = 0; i < x.size(); i++) {
			for (int j = 0; j < y.size(); j++) {
				if (x[i] == y[j]) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				}
				else {
					dp[i + 1][j + 1] = max(dp[i + 1][j], dp[i][j + 1]);
				}
			}
		}
		cout << "#" << t << ' ' << dp[x.size()][y.size()] << '\n';
	}
	return 0;
}