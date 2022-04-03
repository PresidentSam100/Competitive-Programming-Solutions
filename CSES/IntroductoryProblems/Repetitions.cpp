// Repetitions
// Sam Lu

#include <iostream>
#include <string>
using namespace std;

string str, prev;

int main() {
	cin >> str;
	int ans = 1, rep = 1;
	for (int i = 1; i < str.length(); i++) {
		// Adjacent strings match 
		if (str[i] == str[i - 1]) {
			rep++;
		}
		// Adjacent strings don't match
		else {
			rep = 1;
		}
		// Update answer if necessary
		ans = max(rep, ans);
	}
	cout << ans << endl;
	return 0;
}