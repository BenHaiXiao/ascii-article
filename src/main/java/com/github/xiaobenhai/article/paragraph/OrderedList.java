package com.github.xiaobenhai.article.paragraph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 16:16
 */
public class OrderedList implements Paragraph {
    private List<String> data = new ArrayList<String>();

    public List<String> getData() {
        return data;
    }

    public void addItem(String item) {
        data.add(item);
    }

    public void addItems(List<String> items) {
        this.data.addAll(items);
    }

    public void clearItems() {
        this.data.clear();
    }
}
