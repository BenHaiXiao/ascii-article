package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.Text;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 12:06
 */
public class TextRenderer implements Renderer<Text> {
    @Override
    public String render(Text paragraph) {
        return paragraph.getContent();
    }
}
