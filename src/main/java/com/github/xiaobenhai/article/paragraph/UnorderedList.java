package com.github.xiaobenhai.article.paragraph;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 16:17
 */
public class UnorderedList implements Paragraph {
    private List<String> data = Lists.newArrayList();

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
