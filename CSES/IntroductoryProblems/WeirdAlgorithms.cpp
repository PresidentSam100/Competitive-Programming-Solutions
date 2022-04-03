// https://cses.fi/problemset/task/1068
// Weird Algorithms
// Sam Lu

#include <iostream>
using namespace std;

long long int n;

int main() {
	cin >> n;
	cout << n << " ";
	while (n != 1) {
		// Odd number
		if (n & 1)
			n = (3 * n) + 1;
		// Even number
		else
			n >>= 1;
		cout << n << " ";
	}
	return 0;
}
