// https://cses.fi/problemset/task/1639
// Edit Distance

#include <bits/stdc++.h>
#define lli long long int
using namespace std;

string n, m;
lli a, b;
lli dp[2][5002];

int main()
{
	// Input
	getline(cin, n);
	getline(cin, m);
	a = (lli)n.length();
	b = (lli)m.length();
	for (lli i = a; i >= 0; i--) {
		dp[0][i] = i;
	}
	// Dynamic Programming
	for (lli i = 1; i <= b; i++) {
		for (lli j = 0; j <= a; j++) {
			if (j == 0) {
				dp[i % 2][j] = i;
			} else if (n[j - 1] == m[i - 1]) {
				dp[i % 2][j] = dp[(i + 1) % 2][j - 1];
			} else {
				dp[i % 2][j] = 1 + min(min(dp[(i + 1) % 2][j - 1], dp[i % 2][j - 1]), dp[(i + 1) % 2][j]);
			}
		}
	}
	cout << dp[b % 2][a] << endl;
	return 0;
}