package com.github.xiaobenhai.article.render;

import com.github.xiaobenhai.article.paragraph.Table;
import de.vandermeer.asciitable.v2.V2_AsciiTable;
import de.vandermeer.asciitable.v2.render.V2_AsciiTableRenderer;
import de.vandermeer.asciitable.v2.render.WidthAbsoluteEven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 16:39
 */
public class TxtTableRender implements Renderer<Table> {
    private V2_AsciiTableRenderer renderer = new V2_AsciiTableRenderer();

    @Override
    public String render(Table table) {
        V2_AsciiTable at = new V2_AsciiTable();
        at.addRule();
        List<String> cols = table.getColumns();
        List<String> header = new ArrayList<>();
        for (String col : cols) {
            header.add(table.getHeader().get(col));
        }
        at.addRow(header.toArray());
        at.addRule();

        for(int i=0;i<table.size();i++) {
            Map<String, String> row = table.getRow(i);
            List<String> body = new ArrayList<>();
            for (String col : cols) {
                body.add(row.get(col));
            }
            at.addRow(body.toArray());
            at.addRule();
        }
        renderer.setWidth(new WidthAbsoluteEven(20));
        return renderer.render(at).toString();
    }
}
