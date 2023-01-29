// https://leetcode.com/problems/two-sum/description/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    // Solución inicial, poco eficiente
    // for (let i=0; i<nums.length; i++) {
    //     let num1 = nums[i];
    //     for (let j=i+1; j<nums.length; j++) {
    //         let num2 = nums[j];
    //         if ((num1 + num2) == target) {
    //             return [i, j];
    //         }
    //     }
    // }

    // Segunda solución, usando un map
    const tempMap = new Map();

    for (let i=0; i<nums.length; i++) {
        if (!tempMap.has(nums[i])) {
            tempMap.set(nums[i], i);
        }
    }

    for (let i=0; i<nums.length; i++) {
        substraction = target - nums[i];
        if (tempMap.has(substraction) && i != tempMap.get(substraction)){
            return [i, tempMap.get(substraction)];
        }
    }
};