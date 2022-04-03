// https://cses.fi/problemset/task/1083
// Missing Number
// Sam Lu

#include <iostream>
using namespace std;

long long int n, a, ans, sum;

int main() {
	cin >> n;
	for (int i = 0; i < n - 1; i++) {
	    cin >> a;
	    sum += a;
	}
	// Sum of integers from 1 to n: n * (n + 1) / 2
	// Adding missing number to "sum" will satisfy equation above.
	ans = n * (n + 1) / 2 - sum;
	cout << ans;
	return 0;
}
