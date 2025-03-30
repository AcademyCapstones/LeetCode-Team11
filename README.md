# LeetCode-Team11
Leet Code Challenge

// PSEUDO CODE
//FUNCTION mergeTwoLists(list1, list2):
//    CREATE dummyHead = new ListNode(0)
//    SET current = dummyHead
//
//    WHILE list1 != NULL AND list2 != NULL:
//        IF list1.val <= list2.val:
//            current.next = list1
//            list1 = list1.next
//        ELSE:
//            current.next = list2
//            list2 = list2.next
//        END IF
//        current = current.next
//    END WHILE
//
//    // Attach remaining nodes
//    IF list1 != NULL:
//        current.next = list1
//    ELSE IF list2 != NULL:
//        current.next = list2
//    END IF
//
//    RETURN dummyHead.next
//END FUNCTION

================================
/PSEUDO CODE: Create a class List Node
/**
 * Definition for singly-linked list in the List Node class
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//1. Initialize a new ListNode dummyHead with value 0.
//2. Set current pointer to dummyHead.
//3. Set carry to 0.
//4. p1 = l1, p2 = l2.
//
//5. While (p1 is not null OR p2 is not null OR carry != 0):
//   a. x = (p1 != null) ? p1.val : 0
//   b. y = (p2 != null) ? p2.val : 0
//   c. sum = x + y + carry
//   d. carry = sum / 10
//   e. Create a new node with value sum % 10
//   f. current.next = this new node
//   g. current = current.next
//   h. if p1 != null, p1 = p1.next
//   i. if p2 != null, p2 = p2.next
//
//6. Return dummyHead.next //

================================
MISSING NUMBER
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
//

====================================
SQUARES OF A SORTED ARRAY
