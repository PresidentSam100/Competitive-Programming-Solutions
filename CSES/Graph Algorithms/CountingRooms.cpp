// https://cses.fi/problemset/task/1192
// Counting Rooms
// Sam Lu
 
#include <bits/stdc++.h>
#define lli long long int
using namespace std;
 
lli n, m, ans;
string s;
bool visit[1002][1002];
string arr[1002][1002];

// Graph Algorithm for number of rooms
void traverse(lli r, lli c, lli num) {
	if (r == 0 || r == 1002 || c == 0 || c == 1002) {
		return;
	}
	if (arr[r][c].compare(".") != 0 || visit[r][c]) {
		return;
	}
	visit[r][c] = true;
	traverse(r - 1, c, num);
	traverse(r + 1, c, num);
	traverse(r, c - 1, num);
	traverse(r, c + 1, num);
}

int main() {
	// Input
	cin >> n >> m;
	getline(cin, s);
	for (lli r = 1; r <= n; r++) {
		getline(cin, s);
		for (lli c = 1; c <= m; c++) {
			arr[r][c] = s.substr(c - 1, 1);
		}
	}
	// Find the number of rooms
	ans = 0;
	for (lli r = 1; r <= n; r++) {
		for (lli c = 1; c <= m; c++) {
			if (arr[r][c].compare(".") == 0 && !visit[r][c]) {
				traverse(r, c, ans + 1);
				ans++;
			}
		}
	}
	cout << ans;
	return 0;
}