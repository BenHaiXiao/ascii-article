package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.OrderedList;

import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 11:56
 */
public class OrderedListRenderer implements Renderer<OrderedList> {
    @Override
    public String render(OrderedList orderedList) {
        if (orderedList == null || orderedList.getData() == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        List<String> data = orderedList.getData();
        for (int i = 0; i < data.size(); i++) {
            String item = data.get(i);
            builder.append(i + 1).append(". ").append(item).append("\n");
        }
        return builder.toString();
    }
}
