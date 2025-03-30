package leetCodeTeam11;

public class LeetCode1_AverageSalaryExcludingTheMinimumAndMaximumSalary {
	
	public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // Find the minimum and maximum salary and calculate total sum.
        for (int s : salary) {
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            sum += s;
        }
        // Exclude the minimum and maximum salary
        double average = (double)(sum - min - max) / (salary.length - 2);
        return average;
    }

}


//Pseudo Code FUNCTION average(salary: array of int) RETURNS double:
//    SET minSalary TO a very large number
//    SET maxSalary TO a very small number
//    SET totalSum TO 0
//    // Iterate over each salary to find min, max and compute sum.
//    FOR each value s in salary:
//        IF s < minSalary THEN:
//            minSalary = s
//        END IF
//        IF s > maxSalary THEN:
//            maxSalary = s
//        END IF
//        totalSum = totalSum + s
//    END FOR
//    // Calculate average excluding min and max
//    averageValue = (totalSum - minSalary - maxSalary) / (length of salary - 2)
//    RETURN averageValue
//END FUNCTION
