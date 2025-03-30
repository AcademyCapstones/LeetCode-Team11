package leetCodeTeam11;

public class LeetCode3_MissingNumber {

	    public int missingNumber(int[] nums) {
	        int n = nums.length;
	        // Calculate expected sum for numbers from 0 to n
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        
	        // Sum all numbers in the given array
	        for (int num : nums) {
	            actualSum += num;
	        }
	        
	        // The missing number is the difference between expected and actual sums
	        return expectedSum - actualSum;
	    }
	}

//PSEUDO CODE
//FUNCTION missingNumber(nums: array of int) RETURNS int:
//    n = length of nums
//    expectedSum = n * (n + 1) / 2
//    actualSum = 0
//
//    FOR each num in nums DO:
//        actualSum = actualSum + num
//    END FOR
//
//    RETURN expectedSum - actualSum
//END FUNCTION
