package com.bptn.leetCode.LeetCodeTeam11;

public class LeetCode5_MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy head to simplify insertion
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        // While both lists are non-empty, compare the current values
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        // If one list is exhausted, link the remainder of the other list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }
        // Return the merged list (skipping the dummy head)
        return dummyHead.next;
    }
}
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