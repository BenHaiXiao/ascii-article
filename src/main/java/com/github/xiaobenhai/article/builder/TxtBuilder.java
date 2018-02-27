package com.github.xiaobenhai.article.builder;

import com.github.xiaobenhai.article.paragraph.OrderedList;
import com.github.xiaobenhai.article.paragraph.UnorderedList;
import com.github.xiaobenhai.article.render.OrderedListRenderer;
import com.github.xiaobenhai.article.render.TxtTableRender;
import com.github.xiaobenhai.article.paragraph.Table;
import com.github.xiaobenhai.article.paragraph.Text;
import com.github.xiaobenhai.article.render.TextRenderer;
import com.github.xiaobenhai.article.render.UnorderedListRenderer;

import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 16:20
 */
public class TxtBuilder extends AbstractBuilder {

    @Override
    protected void initRegistry() {
        registry(Table.class, new TxtTableRender());
        registry(OrderedList.class, new OrderedListRenderer());
        registry(UnorderedList.class, new UnorderedListRenderer());
        registry(Text.class, new TextRenderer());
    }

    @Override
    protected String joinParagraph(List<String> renderedParagraph) {
        StringBuilder builder = new StringBuilder();
        for (String str : renderedParagraph) {
            builder.append(str);
            builder.append("\n");
        }
        return builder.toString();
    }
}
