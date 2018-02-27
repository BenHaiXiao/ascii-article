package com.github.xiaobenhai.article.render;


import com.github.xiaobenhai.article.paragraph.Table;

import java.util.Map;

/**
 * @author xiaobenhai
 * Date: 2017/3/17
 * Time: 14:30
 */
public class MDTableRenderer implements Renderer<Table> {
    @Override
    public String render(Table paragraph) {
        StringBuilder tableBuilder = new StringBuilder();
        Map<String, String> header = paragraph.getHeader();
        tableBuilder.append("|");
        for (String col : paragraph.getColumns()) {
            tableBuilder.append(header.get(col)).append("|");
        }
        tableBuilder.append("\n");
        tableBuilder.append("|");
        for (String ignored : paragraph.getColumns()) {
            tableBuilder.append("---").append("|");
        }
        tableBuilder.append("\n");
        for (int i = 0; i < paragraph.size(); i++) {
            Map<String, String> row = paragraph.getRow(i);
            tableBuilder.append("|");
            for (String col : paragraph.getColumns()) {
                tableBuilder.append(row.get(col)).append("|");
            }
            tableBuilder.append("\n");
        }
        return tableBuilder.toString();
    }
}
