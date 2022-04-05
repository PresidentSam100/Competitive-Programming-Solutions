// https://cses.fi/problemset/task/1633
// Dice Combinations
// Sam Lu

#include <iostream>
#define lli long long int
using namespace std;

lli n;
lli const MOD = 1000000007;
lli dp[1000011];

int main() {
	cin >> n;
	dp[10] = 1;
	// For sum N, we can backtrack and add sums of previous six values.
	for (lli i = 11; i < 11 + n; i++) {
		dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4] + dp[i - 5] + dp[i - 6];
		dp[i] %= MOD;
	}
	cout << dp[n + 10];
	return 0;
}