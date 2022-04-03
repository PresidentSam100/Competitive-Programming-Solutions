// https://cses.fi/problemset/task/1071
// Number Spiral
// Sam Lu

#include <iostream>
#include <math.h>
#define lli long long int
using namespace std;

lli t, x, y;

int main() {
	cin >> t;
	for (lli i = 0; i < t; i++) {
		cin >> x >> y;
		lli hi = max(x, y);
		lli lo = min(x, y);
		if ((y % 2 == 1 && y == hi) || (x % 2 == 0 && x == hi)) {
			cout << hi * hi - lo + 1 << endl;
		} else {
			cout << (hi - 1) * (hi - 1) + lo << endl;
		}
	}
	return 0;
}