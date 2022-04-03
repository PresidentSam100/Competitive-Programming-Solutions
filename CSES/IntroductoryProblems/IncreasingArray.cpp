// Increasing Array
// Sam Lu

#include <iostream>
using namespace std;

long long int n, x, pre, ans;

int main() {
	cin >> n;
	pre = ans = 0;
	for (int i = 0; i < n; i++) {
		cin >> x;
		// Add when previous number is larger than current number.
		if (pre > x) {
			ans += pre - x;
		}
		// Set previous to current largest number
		else {
		    pre = x;
		}
	}
	cout << ans << endl;
	return 0;
}