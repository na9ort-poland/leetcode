package org.techideas.leetcode.model;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    private final List<Integer> list = new ArrayList<>();

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

    public List<Integer> getWholeList() {
        return null;
    }

}
