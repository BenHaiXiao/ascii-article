package com.github.xiaobenhai.article.builder;

import com.github.xiaobenhai.article.paragraph.OrderedList;
import com.github.xiaobenhai.article.paragraph.Table;
import com.github.xiaobenhai.article.paragraph.UnorderedList;
import com.github.xiaobenhai.article.render.MDTableRenderer;
import com.github.xiaobenhai.article.render.MDTextRenderer;
import com.github.xiaobenhai.article.render.OrderedListRenderer;
import com.github.xiaobenhai.article.render.UnorderedListRenderer;
import com.github.xiaobenhai.article.paragraph.Text;

import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 11:55
 */
public class MarkdownBuilder extends AbstractBuilder {
    @Override
    protected void initRegistry() {
        registry(Table.class, new MDTableRenderer());
        registry(OrderedList.class, new OrderedListRenderer());
        registry(UnorderedList.class, new UnorderedListRenderer());
        registry(Text.class, new MDTextRenderer());
    }

    @Override
    protected String joinParagraph(List<String> renderedParagraph) {
        StringBuilder builder = new StringBuilder();
        for (String str : renderedParagraph) {
            builder.append(str);
            builder.append("\n\n");
        }
        return builder.toString();
    }
}
