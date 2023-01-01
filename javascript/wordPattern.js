// https://leetcode.com/problems/word-pattern/description/

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const patternArray = pattern.split("");
    const inputArray = s.split(" ");
    if (patternArray.length != inputArray.length) {
        return false;
    }
    const arrayLength = pattern.length;

    const usedValues = [];

    const pairs = new Map();
    for (let i = 0; i < arrayLength; i++) {
        if (pairs.has(patternArray[i]) && pairs.get(patternArray[i]) != inputArray[i]) {
            return false;
        }
        else if (!pairs.has(patternArray[i])) {
            if (usedValues.includes(inputArray[i])) {
                return false;
            }
            pairs.set(patternArray[i], inputArray[i]);
            usedValues.push(inputArray[i]);
        }
    }
    return true;
};