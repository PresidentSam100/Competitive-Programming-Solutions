// https://cses.fi/problemset/task/1634
// Minimizing Coins
// Sam Lu

#include <iostream>
#include <climits>
#include <array>
#define lli long long int
using namespace std;

lli n, x, c;
lli dp[1000001], coin[100];

int main() {
	// Input
	cin >> n >> x;
	for (lli i = 0; i < n; i++) {
		cin >> c;
		coin[i] = c;
	}
	// Fill array with max value and set index 0 to value of 0
	fill(dp, dp + x + 1, LLONG_MAX);
	dp[0] = 0;
	// Use dynamic programming to find all possible combinations
	for (lli i = 1; i <= x; i++) {
		for (int j = 0; j < n; j++) {
			if (coin[j] <= i) {
				lli temp = dp[i - coin[j]];
				if (temp != LLONG_MAX && dp[i] - 1 > temp) {
					dp[i] = temp + 1;
				}
			}
		}
	}
	// Possible only when value is not LLONG_MAX
	if (dp[x] == LLONG_MAX) {
		cout << -1;
	} else {
		cout << dp[x];
	}
	return 0;
}