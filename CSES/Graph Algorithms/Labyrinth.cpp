// https://cses.fi/problemset/task/1193
// Labyrinth
// Sam Lu
 
#include <bits/stdc++.h>
#define lli long long int
using namespace std;
 
lli n, m, sR, sC, eR, eC;
string s, path;
lli steps[1002][1002];
string arr[1002][1002];

// Find shortest path
void paths(lli r, lli c, lli step) {
	path = "";
	while (step >= 0) {
		if (steps[r][c - 1] == step) {
			path = path + "L";
			c--;
		} else if (steps[r][c + 1] == step) {
			path = path + "R";
			c++;
		} else if (steps[r - 1][c] == step) {
			path = path + "U";
			r--;
		} else if (steps[r + 1][c] == step) {
			path = path + "D";
			r++;
		}
		step--;
	}
	cout << path;
}

// DFS to traverse graph
void traverse(lli r, lli c, lli step) {
	// Check conditions if valid
	if (r == 0 || r == 1002 || c == 0 || c == 1002) {
		return;
	}
	if (arr[r][c].compare("#") == 0 || steps[r][c] <= step) {
		return;
	}
	// Continue searching
	steps[r][c] = step++;
	traverse(r - 1, c, step);
	traverse(r + 1, c, step);
	traverse(r, c - 1, step);
	traverse(r, c + 1, step);
}

int main() {
	// Input
	cin >> n >> m;
	getline(cin, s);
	// Set values for 2d arrays
	for (lli r = 1; r <= n; r++) {
		getline(cin, s);
		for (lli c = 1; c <= m; c++) {
			arr[r][c] = s.substr(c - 1, 1);
			steps[r][c] = LLONG_MAX;
			// Set start and end points
			if (arr[r][c].compare("A") == 0) {
				sR = r;
				sC = c;
			}
			if (arr[r][c].compare("B") == 0) {
				eR = r;
				eC = c;
			}
		}
	}
	// Graph algorithms for path
	traverse(eR, eC, 0);
	if (steps[sR][sC] == LLONG_MAX) {
		cout << "NO";
	} else {
		cout << "YES" << endl;
		cout << steps[sR][sC] << endl;
		paths(sR, sC, steps[sR][sC] - 1);
	}
	return 0;
}