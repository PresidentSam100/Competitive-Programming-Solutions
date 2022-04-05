// https://cses.fi/problemset/task/1755
// Palindrome Reorder

#include <iostream>
#include <string>
#include <algorithm>
#define lli long long int
using namespace std;

string n, ans, mid, add;
lli odd, ind, len;
lli arr [26];

int main() {
	cin >> n;
	len = (lli)n.length();
	// Count number of occurances for each letter.
	for (lli i = 0; i < len; i++) {
		arr[n.at(i) - 'A']++;
	}
	// Check number of letters with odd amount.
	for (lli i = 0; i < 26; i++) {
		if (arr[i] % 2 == 1) {
			odd++;
			ind = i;
		}
	}
	// For a palindrome, up to one letter can have an odd count.
	if (odd > 1) {
		cout << "NO SOLUTION";
	} else {
		// Put the odd count letters (if any) in the middle.
		if (odd == 1) {
			mid.append(arr[ind], ind + 'A');
		}
		// For letters with an even count, add half to the start and half to the end.
		for (lli i = 0; i < 26; i++) {
			if (arr[i] % 2 == 0) {
				add.append(arr[i] / 2, i + 'A');
			}
		}
		// Build Palindrome
		ans.append(add);
		ans.append(mid);
		reverse(add.begin(), add.end());
		ans.append(add);
		cout << ans;
	}
	return 0;
}