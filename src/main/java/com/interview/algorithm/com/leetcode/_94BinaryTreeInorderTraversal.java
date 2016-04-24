package com.interview.algorithm.com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 4/17/16.
 */
public class _94BinaryTreeInorderTraversal {

    List<Integer> list = null;

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();

        inOrder(root);
        return list;
    }

    public void inOrder(TreeNode p) {
        if ( p != null ) {
            inOrder(p.left);
            list.add(p.val);
            inOrder(p.right);
        }
    }
}
