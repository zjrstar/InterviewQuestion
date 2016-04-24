package com.interview.algorithm.com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 4/17/16.
 */
public class _144BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preOrder(root, list);
        return list;
    }

    public void preOrder(TreeNode p, List<Integer> list) {
        if ( p != null ) {
            list.add(p.val);
            preOrder(p.left, list);
            preOrder(p.right, list);
        }
    }
}
