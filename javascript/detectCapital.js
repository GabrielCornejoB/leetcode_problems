// https://leetcode.com/problems/detect-capital/description/

/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    if (word == word.toLowerCase() || word == word.toUpperCase()) { // All upper or all minus == true
        return true;
    }
    else if (word[0] != word[0].toUpperCase()) { // First letter minus and not all letter minus == false
        return false;
    }
    else if (word[0] == word[0].toUpperCase()) { // First letter upper
        for (let i = 1; i < word.length; i++) {
            if (word[i] == word[i].toUpperCase()) { // One letter different from first is upper == false
                return false;
            }
        }
        return true; // Else (first letter upper and the rest minus) == true
    }
 
};