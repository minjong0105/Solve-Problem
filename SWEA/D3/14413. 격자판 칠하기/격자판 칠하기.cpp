#include <iostream>
#include <vector>
#include <string>
using namespace std;

bool ispossible(const vector<string>& board, int N, int M, char firstcolor) {
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			char expectcolor = ((i + j) % 2 == 0) ? firstcolor : (firstcolor == '#' ? '.' : '#');
			if (board[i][j] == '?') continue;
			if (board[i][j] != expectcolor) return false;
		}
	}
	return true;
}

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int N, M;
		cin >> N >> M;

		vector<string> board(N);
		for (int i = 0; i < N; i++) {
			cin >> board[i];
		}

		bool possible = ispossible(board, N, M, '#') || ispossible(board, N, M, '.');
		cout << "#" << t << ' ' << (possible ? "possible" : "impossible") << '\n';
	}
	return 0;
}