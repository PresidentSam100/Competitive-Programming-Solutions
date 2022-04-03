// https://cses.fi/problemset/task/1621
// Distinct Numbers
// Sam Lu

#include <iostream>
#include <set>
using namespace std;

long long int n, a;
set<int> nums;

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
	    cin >> a;
		// Set will not insert duplicate values
		nums.insert(a);
	}
	cout << nums.size();
	return 0;
}
