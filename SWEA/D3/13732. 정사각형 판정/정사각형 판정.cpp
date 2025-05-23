#include <iostream>
#include <vector>
using namespace std;

bool checking(const vector<string>& board, int N) {
	int count = 0;
	int startRow = -1, startCol = -1;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (board[i][j] == '#') {
				count++;
				if (startRow == -1) {
					startRow = i;
					startCol = j;
				}
			}
		}
	}
	if (count == 0) return false;

	int len = 0;
	while (startCol + len < N && board[startRow][startCol + len] == '#') {
		len++;
	}
	int answer = 0;
	for (int i = startRow; i < startRow + len; i++) {
		for (int j = startCol; j < startCol + len; j++) {
			if (board[i][j] != '#') return false;
			answer++;
		}
	}
	return count == answer;
}

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int N;
		cin >> N;

		vector<string> board(N);
		for (int i = 0; i < N; i++) {
			cin >> board[i];
		}

		bool check = checking(board, N);
		cout << "#" << t << ' ' << (check ? "yes" : "no") << '\n';
	}
	return 0;
}