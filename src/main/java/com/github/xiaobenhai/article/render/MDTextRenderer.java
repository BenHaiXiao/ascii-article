package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.Text;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 14:19
 */
public class MDTextRenderer implements Renderer<Text> {
    @Override
    public String render(Text text) {
        String content = text.getContent();
        Text.Type type = text.getType();
        if (type.isNormal()) {
            return content;
        }
        StringBuilder builder = new StringBuilder();
        int level = type.getLevel();
        for (int i = 0; i < level; i++) {
            builder.append("#");
        }
        builder.append(" ").append(content);
        return builder.toString();
    }
}
