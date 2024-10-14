package org.techideas.leetcode;

import org.techideas.leetcode.model.ListNode;

import java.util.Optional;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var l1Optional = Optional.ofNullable(l1);
        var l2Optional = Optional.ofNullable(l2);

        var head = new ListNode();
        var listNodeSum = head;
        int saveDecade = 0;

        while (l1Optional.isPresent() || l2Optional.isPresent()) {
            var cell = l1Optional.orElse(new ListNode(0)).val
                    + l2Optional.orElse(new ListNode(0)).val
                    + saveDecade;
            if (cell > 9) {
                cell -= 10;
                saveDecade = 1;
            }

            listNodeSum.val = cell;
            listNodeSum.next = isNeededToCreateOneMoreNewListNode(l1Optional, l2Optional) ? new ListNode() : null;
            if (listNodeSum.next == null) {
                break;
            }

            listNodeSum = listNodeSum.next;

            l1Optional = l1Optional.map(listNode -> listNode.next);
            l2Optional = l2Optional.map(listNode -> listNode.next);
        }

        return head;
    }

    private boolean isNeededToCreateOneMoreNewListNode(Optional<ListNode> l1Optional, Optional<ListNode> l2Optional) {
        return (l1Optional.isPresent() && l1Optional.get().next != null)
                || (l2Optional.isPresent() && l2Optional.get().next != null);
    }
}