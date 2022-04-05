// https://cses.fi/problemset/task/1635
// Coin Combinations I
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
		dp[c] = 1;
	}
	// Use dynamic programming to find all possible combinations with repetition.
	for (lli i = 0; i <= x; i++) {
		for (lli j = 0; j < n; j++) {
			if (coin[j] <= i) {
				dp[i] += dp[i - coin[j]];
				dp[i] %= MOD;
			}
		}
	}
	cout << dp[x];
	return 0;
}