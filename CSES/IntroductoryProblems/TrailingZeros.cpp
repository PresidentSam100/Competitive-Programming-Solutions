// https://cses.fi/problemset/task/1618
// Trailing Zeros

#include <iostream>
#include <math.h>
#define lli long long int
using namespace std;

lli n, ans, num;

int main() {
	cin >> n;
	// N! has a zero when divisible by 5 and 2
	// If divisible by 5^X for some integer X we add X zeros to the answer.
	// e.g. (N / 25): 2 zeros; (N / 125) 3 zeros; ...
	num = 5;
	while (num <= n) {
		ans += n / num;
		num *= 5;
	}
	cout << ans;
	return 0;
}