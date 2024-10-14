package org.techideas.leetcode.model;

import java.util.LinkedList;
import java.util.List;

public class ListNode {

    public Integer val;
    public ListNode next;

    ListNode() {}

    ListNode(Integer val) {
        this.val = val;
    }

    ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(Integer... numbers) {
        if (numbers == null) {
            return null;
        }

        var head = new ListNode();
        var listNode = head;

        for (int numb : numbers) {
            listNode.val = numb;
            listNode.next = new ListNode();
            listNode = listNode.next;
        }

        return head;
    }


    public List<Integer> getWholeList() {
        var list = new LinkedList<Integer>();
        var iterator = this;

        while (iterator.next != null) {
            list.add(iterator.val);
            iterator = iterator.next;
        }

        return list;
    }
}
