// https://cses.fi/problemset/task/1070
// Permutations
// Sam Lu

#include <iostream>
using namespace std;

long long int n;

int main() {
	cin >> n;
	// One number works
	if (n == 1)
		cout << 1;
	// Observation: Permutation doesn't exist for 1 < N < 4
	if (n < 4)
		cout << "NO SOLUTION";
	// Print even numbers ascending than odd number ascending.
	else {
		for (int i = 2; i <= n; i += 2) {
			cout << i;
			cout << " ";
		}
		for (int i = 1; i <= n; i += 2) {
			cout << i;
			cout << " ";
		}
	}
	return 0;
}