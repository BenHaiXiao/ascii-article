package com.github.xiaobenhai.article;

import com.github.xiaobenhai.article.builder.HtmlBuilder;
import com.github.xiaobenhai.article.builder.MarkdownBuilder;
import com.github.xiaobenhai.article.builder.TxtBuilder;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 15:55
 */
public class ArticleExporter {
    private TxtBuilder txtBuilder = new TxtBuilder();
    private MarkdownBuilder markdownBuilder = new MarkdownBuilder();
    private HtmlBuilder htmlBuilder = new HtmlBuilder();

    public static ArticleExporter create() {
        return new ArticleExporter();
    }

    public String toTxt(Article article) {
        return txtBuilder.build(article);
    }

    public String toMarkdown(Article article) {
        return markdownBuilder.build(article);
    }

    public String toHtml(Article article) {
        return htmlBuilder.build(article);
    }
}
