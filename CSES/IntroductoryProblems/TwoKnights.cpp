// https://cses.fi/problemset/task/1072
// Two Knights
// Sam Lu

#include <iostream>
#include <math.h>
using namespace std;

long long int n, ans;

int main() {
	cin >> n;
	// Formula for number of non-attacking knights on n x n chessboard: (n - 1)(n + 4)(n^2 - 3n + 4)/2
	for (long long int k = 1; k <= n; k++) {
		cout << (k - 1) * (k + 4) * (k * k - 3 * k + 4) / 2 << endl;
	}
	return 0;
}