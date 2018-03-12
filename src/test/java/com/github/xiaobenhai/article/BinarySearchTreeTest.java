package com.github.xiaobenhai.article;

import org.junit.Test;

/**
 * @author xiaobenhai
 * Date: 2018/3/11
 * Time: 22:36
 */
public class BinarySearchTreeTest {

    @Test
    public  void test() {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(3);b.insert(8);b.insert(1);b.insert(4);b.insert(6);
        b.insert(2);b.insert(10);b.insert(9);b.insert(20);b.insert(25);

//        // 打印二叉树
        b.toString(b.root);
        TreeNode node3 = b.search(1);
        System.out.println(b.searchMaxOfMinKey(20).value);
//



    }
}
