package org.techideas.leetcode.model;

import java.util.LinkedList;
import java.util.List;

public class ListNode {

    public Integer val;
    public ListNode next;

    public ListNode() {}

    public ListNode(Integer val) {
        this.val = val;
    }

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(Integer... numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        var head = new ListNode();
        var listNode = head;
        var index = 0;

        for (int numb : numbers) {
            listNode.val = numb;
            listNode.next = index == numbers.length - 1 ? null :new ListNode();
            listNode = listNode.next;
            ++index;
        }

        return head;
    }


    public List<Integer> getWholeList() {
        var list = new LinkedList<Integer>();
        var iterator = this;

        while (iterator != null) {
            list.add(iterator.val);
            iterator = iterator.next;
        }

        return list;
    }

    public int getNodeListLength() {
        var iterator = this;
        int length = 0;

        while (iterator != null) {
            ++length;
            iterator = iterator.next;
        }

        return length;
    }
}
