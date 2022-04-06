// https://cses.fi/problemset/task/1637
// Removing Digits

#include <iostream>
#include <math.h>
#define lli long long int
using namespace std;

lli n;
lli dp[1000001];

int main() {
	cin >> n;
	// Use Dynamic Programming to quickly find minimum steps.
	for (lli i = 1; i <= n; i++) {
		lli d = i;
		while (d > 0) {
			if (dp[i] == 0 && d % 10 != 0) {
				dp[i] = 1 + dp[i - (d % 10)];
			} else if (d % 10 != 0) {
				dp[i] = min(dp[i], 1 + dp[i - (d % 10)]);
			}
			d /= 10;
		}
	}
	cout << dp[n];
	return 0;
}