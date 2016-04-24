package com.interview.algorithm.com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 4/17/16.
 */
public class _145BinaryTreePostorderTraversal {

    List<Integer> list = null;

    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        postOrder(root);
        return list;
    }

    public void postOrder(TreeNode p) {
        if ( p != null ) {
            postOrder(p.left);
            postOrder(p.right);
            list.add(p.val);
        }
    }
}
