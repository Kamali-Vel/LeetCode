Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

//SOLUTION

class Solution {
    public int singleNumber(int[] nums) {
       int result=0;
       for(int num:nums){
        result^=num;
       } 
       return result;
    }
}

Time Complexity: 
The time complexity is 𝑂(𝑛), where 𝑛is the number of elements in the array. This is because we are iterating over the array exactly once.
Space Complexity:
The space complexity is 𝑂(1), as we are using a constant amount of extra space (the result variable) regardless of the size of the input array.
