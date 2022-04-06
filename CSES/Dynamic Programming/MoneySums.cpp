// https://cses.fi/problemset/task/1745
// Money Sums
// Sam Lu

#include <bits/stdc++.h>
#define lli long long int
using namespace std;

lli n, x, sum, k;
lli arr[100];
lli dp[100001];

int main() {
	// Input
	cin >> n;
	for (lli i = 0; i < n; i++) {
		cin >> x;
		arr[i] = x;
		sum += x;
	}
	// Dynamic Programming to find distint money sums
	for (lli i = 0; i < n; i++) {
		for (lli j = sum; j >= arr[i]; j--) {
			dp[j] = max(dp[j], dp[j - arr[i]]);
		}
		dp[arr[i]] = 1;
	}
	// Find number of distinct money sums
	for (lli i = 1; i <= sum; i++) {
		if (dp[i] == 1) {
		    k++;
		}
	}
	cout << k << endl;
	// Print all possible sums
	for (lli i = 1; i <= sum; i++) {
		if (dp[i] == 1) {
			cout << i << " ";
		}
	}
	return 0;
}