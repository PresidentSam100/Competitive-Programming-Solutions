// https://cses.fi/problemset/task/1145
// Increasing Subsequence

#include <bits/stdc++.h>
#define lli long long int
using namespace std;

lli n, x, ans;
lli arr[200000], sum[200000];

int main()
{
	// Input
	cin >> n;
	for (lli i = 0; i < n; i++) {
		cin >> x;
		arr[i] = x;
	}
	// Dynamic Programming
	for (lli a : arr) {
		lli x = 0;
		lli y = ans;
		while (x != y) {
			lli z = (x + y) / 2;
			if (sum[z] < a) {
				x = z + 1;
			} else {
				y = z;
			}
		}
		sum[x] = a;
		if (x == ans) {
			ans = ans + 1;
		}
	}
	cout << ans;
	return 0;
}