package com.github.xiaobenhai.article.builder;

import com.github.xiaobenhai.article.Article;
import com.github.xiaobenhai.article.paragraph.Paragraph;
import com.github.xiaobenhai.article.render.Renderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 18:27
 */
public abstract class AbstractBuilder implements Builder {
    private Map<Class<? extends Paragraph>, Renderer<?>> registry = new HashMap<Class<? extends Paragraph>, Renderer<?>>();

    public AbstractBuilder() {
        initRegistry();
    }

    protected abstract void initRegistry();

    public void registry(Class<? extends Paragraph> clz, Renderer<?> renderer) {
        registry.put(clz, renderer);
    }

    protected abstract String joinParagraph(List<String> renderedParagraph);

    @SuppressWarnings("unchecked")
    @Override
    public String build(Article article) {
        List<String> result = new ArrayList<String>();
        List<Paragraph> paragraphs = article.getParagraphs();
        for (Paragraph paragraph : paragraphs) {
            Renderer renderer = registry.get(paragraph.getClass());
            result.add(renderer.render(paragraph));
        }
        return joinParagraph(result);
    }
}
