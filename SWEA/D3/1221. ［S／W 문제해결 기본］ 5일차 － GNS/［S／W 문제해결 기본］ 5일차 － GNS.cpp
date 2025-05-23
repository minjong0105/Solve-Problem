#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
#include <algorithm>
using namespace std;

int main() {
	vector<string> v = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

	unordered_map<string, int> str_to_num;
	for (int i = 0; i <= 9; i++) {
		str_to_num[v[i]] = i;
	}

	int T;
	cin >> T;
	for (int t = 1; t <= T; t++) {
		string testcase;
		int N;
		cin >> testcase >> N;

		vector<int> nums(N);
		for (int i = 0; i < N; i++) {
			string s;
			cin >> s;
			nums[i] = str_to_num[s];
		}
		sort(nums.begin(), nums.end());

		cout << "#" << t << '\n';
		for (int i = 0; i < N; i++) {
			cout << v[nums[i]] << ' ';
		}
	}
	return 0;
}