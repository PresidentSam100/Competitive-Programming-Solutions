// https://cses.fi/problemset/task/1617
// Bit Strings
// Sam Lu

#include <iostream>
#include <math.h>
#define lli long long int
using namespace std;

lli n, power;
lli MOD = 1000000007;

int main() {
	cin >> n;
	power = 1;
	// Multiply by 2 and MOD N times
	for (lli i = 0; i < n; i++) {
	    power *= 2;
	    power %= MOD;
	}
	cout << power;
	return 0;
}