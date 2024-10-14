package org.techideas.leetcode;

import org.techideas.leetcode.model.ListNode;


class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var head = new ListNode();
        var listNodeSum = head;
        int saveDecade = 0;

        while (l1 != null || l2 != null) {
            var cell = (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0)
                    + saveDecade;
            saveDecade = 0;
            if (cell > 9) {
                cell -= 10;
                saveDecade = 1;
            }

            listNodeSum.val = cell;
            listNodeSum.next = (l1 != null && l1.next != null) || (l2 != null && l2.next != null)
                    ? new ListNode() : null;
            if (listNodeSum.next == null) {
                break;
            }

            listNodeSum = listNodeSum.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (saveDecade != 0) {
            listNodeSum.next = new ListNode(saveDecade, null);
        }

        return head;
    }
}