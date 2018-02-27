package com.github.xiaobenhai.article;

import com.github.xiaobenhai.article.paragraph.OrderedList;
import com.github.xiaobenhai.article.paragraph.Table;
import com.github.xiaobenhai.article.paragraph.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 9:52
 */
public class TestClient {
    public static void main(String[] args) {
        Article article = new Article();
        article.setTitle("Hello World");

        Text text = new Text();
        text.setContent("content");
        text.setType(Text.Type.H1);
        article.addParagraph(text);

        Table table = new Table();
        table.addHeader("param", "属性");
        table.addHeader("info", "说明");

        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, String> b = new HashMap<>();
            b.put("param", "file");
            b.put("info", "文件");
            list.add(b);
        }
        table.addRecords(list);
        article.addParagraph(table);


        OrderedList ol = new OrderedList();
        ol.addItem("test1");
        ol.addItem("test2");
        ol.addItem("test3");
        article.addParagraph(ol);

        ArticleExporter builder = new ArticleExporter();
        String s = builder.toTxt(article);
        System.out.println(s);
        s = builder.toMarkdown(article);
        System.out.println(s);
    }
}
