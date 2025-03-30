package leetCodeTeam11;

public class LeetCode2_SquaresOfASortedArray {
	
	 public int[] sortedSquares(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        int left = 0, right = n - 1;
	        int position = n - 1;  // Position to fill in the result array
	        
	        while (left <= right) {
	            // Compare absolute values
	            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
	                result[position--] = nums[left] * nums[left];
	                left++;
	            } else {
	                result[position--] = nums[right] * nums[right];
	                right--;
	            }
	        }
	        return result;
	    }
	}

//FUNCTION sortedSquares(nums: array of int) RETURNS array of int:
//    n = length of nums
//    result = new array of int with size n
//    left = 0
//    right = n - 1
//    position = n - 1
//    
//    WHILE left <= right DO:
//        IF absolute(nums[left]) > absolute(nums[right]) THEN:
//            result[position] = nums[left] * nums[left]
//            left = left + 1
//        ELSE:
//            result[position] = nums[right] * nums[right]
//            right = right - 1
//        END IF
//        position = position - 1
//    END WHILE
//    
//    RETURN result
//END FUNCTION
