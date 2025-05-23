#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> tree;

void maketree(const vector<int>& num, int start, int end, int level) {
	if (start > end) return;
	int mid = (start + end) / 2;
	tree[level].push_back(num[mid]);
	maketree(num, start, mid - 1, level + 1);
	maketree(num, mid + 1, end, level + 1);
}

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int K;
		cin >> K;

		int N = 1;
		int k = K;
		while (k > 0) {
			N *= 2;
			k--;
		}
		N -= 1;


		vector<int> num(N);
		for (int i = 0; i < N; i++) {
			cin >> num[i];
		}
		
		tree.assign(K, vector<int>());
		maketree(num, 0, N - 1, 0);
		
		cout << "#" << t << ' ';
		for (int i = 0; i < K; i++) {
			for (int j : tree[i]) {
				cout << j << ' ';
			}
			cout << '\n';
		}
	}
	return 0;
}