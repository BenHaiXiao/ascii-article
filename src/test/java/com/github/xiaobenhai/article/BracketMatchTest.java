package com.github.xiaobenhai.article;

import org.junit.Assert;
import org.junit.Test;
import java.util.Stack;

/**
 * @author xiaobenhai
 * Date: 2018/3/11
 * Time: 22:36
 */
public class BracketMatchTest {
    public static  boolean match(String bracketStr){
        Stack<String> stack = new Stack<String>();
        char[] bracketArray =  bracketStr.toCharArray();
        for (char bracket : bracketArray) {
            switch (bracket) {
                case '{':
                    stack.push("{");
                    break;
                case '[':
                    stack.push("[");
                    break;
                case '(':
                    stack.push("(");
                    break;
                case ')':
                    if (!(stack.pop().equals("("))) {
                        return false;
                    }else{
                        break;
                    }
                case ']':
                    if (!(stack.pop().equals("["))) {
                        return false;
                    }else{
                        break;
                    }
                case '}':
                    if (!(stack.pop().equals("{"))) {
                        return false;
                    }else{
                        break;
                    }
            }
        }
        return true;
    }

    @Test
    public void test(){
        String test1 = "[112332]dfd{2323[787]dfd}(dfdf{ee[dfd]dfde}dfd)";
        Assert.assertEquals(true, BracketMatchTest.match(test1));
        String test2 = "((({{{{{[[[))}}}))";
        Assert.assertEquals(false, BracketMatchTest.match(test2));
        String test3 = "{}{}[][][[]](((()))){{{((([[[]]])))}}}";
        Assert.assertEquals(true, BracketMatchTest.match(test3));
    }
}
