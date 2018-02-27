package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.Paragraph;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 19:09
 */
public interface Renderer<T extends Paragraph> {
    String render(T paragraph);
}
