package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.UnorderedList;

import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 12:02
 */
public class UnorderedListRenderer implements Renderer<UnorderedList> {
    @Override
    public String render(UnorderedList unorderedList) {
        if (unorderedList == null || unorderedList.getData() == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        List<String> data = unorderedList.getData();
        for (String item : data) {
            builder.append("- ").append(item).append("\n");
        }
        return builder.toString();
    }
}
