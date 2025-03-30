package com.bptn.leetCode.LeetCodeTeam11;

public class LeetCode4_AddTwoNumbers {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head to build the resulting list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        // Initialize pointers for the two lists
        ListNode p1 = l1;
        ListNode p2 = l2;
        // Variable to store carry from adding digits
        int carry = 0;
        // Loop until both lists are processed or there is no carry left
        while (p1 != null || p2 != null || carry != 0) {
            // Get the current values or 0 if any list is exhausted
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            // Calculate the sum and determine new carry
            int sum = x + y + carry;
            carry = sum / 10;
            // Create a new node for the digit
            current.next = new ListNode(sum % 10);
            // Move pointers forward
            current = current.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        // The head of the result list is dummyHead.next
        return dummyHead.next; //
    }
}
//PSEUDO CODE: Create a class List Node
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
//a. x = (p1 != null) ? p1.val : 0
//b. y = (p2 != null) ? p2.val : 0
//c. sum = x + y + carry
//d. carry = sum / 10
//e. Create a new node with value sum % 10
//f. current.next = this new node
//g. current = current.next
//h. if p1 != null, p1 = p1.next
//i. if p2 != null, p2 = p2.next
//
//6. Return dummyHead.next //