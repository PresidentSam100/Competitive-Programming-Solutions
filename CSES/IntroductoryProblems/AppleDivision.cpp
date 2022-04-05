// https://cses.fi/problemset/task/1084
// Apartments
// Sam Lu

#include <iostream>
#include <climits>
#include <string>
#include <bitset>
#include <math.h>
#define lli long long int
using namespace std;

lli n, p, ans, g1, g2;
lli arr[20];

int main() {
	cin >> n;
	ans = LLONG_MAX;
	for (int i = 0; i < n; i++) {
		cin >> p;
		arr[i] = p;
	}
	// Since n is small (n <= 20) we can brute force by alternating between piles.
	// We look at all combinations and find the one with lowest difference.
	for (lli i = 0; i < pow(2, n); i++) {
		string s = bitset<20>(i).to_string();
		g1 = g2 = 0;
		for (int j = s.length() - n; j < s.length(); j++) {
		    if (s.substr(j, 1).compare("0") == 0) {
		        g1 += arr[j + n - s.length()];
		    } else {
		        g2 += arr[j + n - s.length()];
		    }
		}
		ans = min(ans, abs(g1 - g2));
	}
	cout << ans;
	return 0;
}