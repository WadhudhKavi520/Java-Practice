class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If both lists are not empty
        if (list1 != null && list2 != null) {
            // Compare the values of the current nodes of list1 and list2
            if (list1.val < list2.val) {
                // If list1's value is smaller, it becomes part of the merged list
                // Recursively merge the rest of list1 with list2
                list1.next = mergeTwoLists(list1.next, list2);
                return list1; // Return list1 as the head of the merged list
            } else {
                // If list2's value is smaller or equal, it becomes part of the merged list
                // Recursively merge list1 with the rest of list2
                list2.next = mergeTwoLists(list1, list2.next);
                return list2; // Return list2 as the head of the merged list
            }
        }
        
        // If list1 is null, return list2 (remaining nodes of list2 will form the merged list)
        if (list1 == null) {
            return list2;
        }

        // If list2 is null, return list1 (remaining nodes of list1 will form the merged list)
        return list1;
    }
}