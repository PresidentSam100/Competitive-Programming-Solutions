// https://cses.fi/problemset/task/1092
// Two Sets
// Sam Lu

#include <iostream>
#include <math.h>
using namespace std;

long long int n;

int main() {
	cin >> n;
	// No such division exists if there are 4N + 1 or 4N + 2 integers for some integer N.
	if (n % 4 == 2 || n % 4 == 1)
		cout << "NO";
	// Case 1: 4N + 3 numbers for some integer N
	// Put 1 and 2 for first set and 3 for second set
	// For the next four numbers, put greatest and least in one set and remaining numbers in the other set
	else if (n % 4 == 3) {
		cout << "YES" << endl;
		cout << (n + 1) / 2 << endl;
		cout << 1 << " " << 2;
		for (int i = 1; i <= n / 4; i++) {
			cout << " " << (i * 4) << " " << (i * 4 + 3);
		}
		cout << endl << n / 2 << endl;
		cout << 3;
		for (int i = 1; i <= n / 4; i++) {
			cout << " " << (i * 4 + 1) << " " << (i * 4 + 2);
		}
	} 
	// Case 2: 4N numbers for some integer N
	// For the next four numbers, put greatest and least in one set and remaining numbers in the other set
	else {
		cout << "YES" << endl;
		cout << n / 2 << endl;
		for (int i = 0; i < n / 4; i++) {
			cout << (i * 4 + 1) << " " << (i * 4 + 4) << " ";
		}
		cout << endl << n / 2 << endl;
		for (int i = 0; i < n / 4; i++) {
			cout << (i * 4 + 2) << " " << (i * 4 + 3) << " ";
		}
	}
	return 0;
}
