// https://cses.fi/problemset/task/1638s
// Grid Paths
// Sam Lu

#include <iostream>
#include <math.h>
#include <array>
#include <string>
#define lli long long int
using namespace std;

lli n;
lli const MOD = 1000000007;
string s;
lli dp[1001][1001];
string arr[1001][1001];

int main() {
	// Input
	cin >> n;
	for (lli r = 1; r <= n; r++) {
		cin >> s;
		for (lli c = 1; c <= n; c++) {
		    arr[r][c] = s[c - 1];
		}
	}
	dp[1][0] = 1;
	// Dynamic Programming Algorithm to find number of paths
	for (lli r = 1; r <= n; r++) {
		for (lli c = 1; c <= n; c++) {
			if (arr[r][c].compare("*") != 0) {
				dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
				dp[r][c] %= MOD;
			}
		}
	}
    cout << dp[n][n];
	return 0;
}