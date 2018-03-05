package com.github.xiaobenhai.article;

import com.github.xiaobenhai.article.paragraph.Paragraph;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 15:57
 */
public class Article {
    private String title;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private String author;
    private Date createTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public void addParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs.addAll(paragraphs);
    }

    public void clearParagraphs() {
        this.paragraphs = null;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", paragraphs=" + paragraphs +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
