// https://cses.fi/problemset/task/1158
// Book Shop
// Sam Lu

#include <iostream>
#include <math.h>
#include <array>
#define lli long long int
using namespace std;

lli n, x, h, s;
lli H[1005], S[1005];
lli dp[100001];

int main() {
	// Input
	cin >> n >> x;
	for (lli i = 0; i < n; i++) {
		cin >> h;
		H[i] = h;
	}
	for (lli i = 0; i < n; i++) {
		cin >> s;
		S[i] = s;
	}
	// My implementation of knapsack dynamic programming to solve the problem
	for (lli a = 0; a < n; a++) {
		for (lli b = x; b >= 0; b--) {
			if (H[a] <= b) {
				dp[b] = max(dp[b], dp[b - H[a]] + S[a]);
			}
		}
	}
	// Maximum number of pages
	cout << dp[x];
	return 0;
}
