/*You are given a string, find its rank among all its permutations sorted lexicographically. 

Examples:

Input : str[] = "acb"
Output : Rank = 2

Input : str[] = "string"
Output : Rank = 598

Input : str[] = "cba"
Output : Rank = 6

*/



#include <bits/stdc++.h>
using namespace std;
 
// Function to print rank of string
// using next_permute()
int findRank(string str)
{
    // store original string
    string orgStr = str;
 
    // Sort the string in lexicographically
    // ascending order
    sort(str.begin(), str.end());
 
    // Keep iterating until
    // we reach equality condition
    long int i = 1;
    do {
        // check for nth iteration
        if (str == orgStr)
            break;
 
        i++;
    } while (next_permutation(str.begin(), str.end()));
 
    // return iterator value
    return i;
}
 
// Driver code
int main()
{
    string str = "GEEKS";
    cout << findRank(str);
    return 0;
}
