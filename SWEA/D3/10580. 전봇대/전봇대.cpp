#include <iostream>
#include <vector>
using namespace std;

int main() {
	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		int N;
		cin >> N;

		vector<int> A(N);
		vector<int> B(N);

		for (int i = 0; i < N; i++) {
			cin >> A[i] >> B[i];
		}

		int count = 0; 

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if ((A[i] < A[j] && B[i] > B[j]) || (A[i] > A[j] && B[i] < B[j])) {
					count++;
				}
			}
		}
		cout << "#" << t << ' ' << count << '\n';
	}
	return 0;
}