// https://leetcode.com/problems/roman-to-integer/description/

/**
 * @param {string} s
 * @return {number}
 */

var romanToInt = function(s) {
    const romanDict = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000
    };

    let ans = 0;

    for (let i = 0; i < s.length; i++) {
        let c = s[i];
        if (c != s[i+1]) {
            if ((c == "I" && s[i+1] == "V") || (c == "I" && s[i+1] == "X") || 
                (c == "X" && s[i+1] == "L") || (c == "X" && s[i+1] == "C") ||
                (c == "C" && s[i+1] == "D") || (c == "C" && s[i+1] == "M")) {
                sub = romanDict[s[i+1]] - romanDict[c];
                ans += sub;
                i += 1;
            }
            else {
                ans += romanDict[c];
            }   
        }
        else if (c == s[i+2] && c == s[i+1]) {
            sum = romanDict[c] * 3;
            ans += sum;
            i += 2;
        }
        else if (c == s[i+1]) {
            sum = romanDict[c] * 2;
            ans += sum;
            i += 1;
        }
    }
    return ans;
};