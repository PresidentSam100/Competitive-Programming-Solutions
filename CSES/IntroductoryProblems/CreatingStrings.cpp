// https://cses.fi/problemset/task/1622
// Creating Strings

#include <iostream>
#include <set>
#include <algorithm>
#include <string>
#include <cstring>
#define lli long long int
using namespace std;

string n;
lli len;

int main() {
	cin >> n;
	// Set will not contain duplicates
	set<string> strs;
	len = n.length();
	// Put string into sorted char array
	char arr[len];
	strcpy(arr, n.c_str());
	sort(arr, arr + len);
	// Use next_permutation(arr, arr + len) to get all permutations w/o repetition
	do {
	    strs.insert(arr);
	} 
	while (next_permutation(arr, arr + len));
	cout << strs.size() << endl;
	for (auto it = strs.begin(); it != strs.end(); it++) {
        cout << *it << endl;
	}
	return 0;
}