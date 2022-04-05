// https://cses.fi/problemset/task/1636
// Coin Combinations II
// Sam Lu

#include <iostream>
#include <climits>
#include <array>
#define lli long long int
using namespace std;

lli n, x, c;
lli const MOD = 1000000007;
lli dp[1000001], coin[100];

int main() {
	// Input
	cin >> n >> x;
	for (lli i = 0; i < n; i++) {
		cin >> c;
		coin[i] = c;
	}
	dp[0] = 1;
	// Use dynamic programming to find all possible combinations without repetition.
	for (lli i = 0; i < n; i++) {
		for (lli j = coin[i]; j <= x; j++) {
			dp[j] += dp[j - coin[i]];
			dp[j] %= MOD;
		}
	}
	cout << dp[x];
	return 0;
}