// https://cses.fi/problemset/task/1754
// Coin Piles
// Sam Lu

#include <iostream>
#define lli long long int
using namespace std;

lli t, a, b;

int main() {
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> a >> b;
		// Observation 1: Total number of coins (a + b) must be divisible by 3.
		// Observation 2: Bigger pile can't have more than twice the coins of the smaller pile
		if ((a + b) % 3 == 0 && max(a, b) <= 2 * min(a, b)) {
			cout << "YES" << endl;
		} else {
			cout << "NO" << endl;
		}
	}
	return 0;
}