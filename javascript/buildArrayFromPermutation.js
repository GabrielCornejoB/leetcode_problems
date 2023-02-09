// https://leetcode.com/problems/build-array-from-permutation/
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    let ans = [];
    for (const num of nums) {
        ans.push(nums[num]);
    }
    return ans;
};