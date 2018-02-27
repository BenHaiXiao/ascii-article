package com.github.xiaobenhai.article.paragraph;

import com.google.common.collect.HashBasedTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 16:15
 */
public class Table implements Paragraph {
    private com.google.common.collect.Table<Integer, String, String> data = HashBasedTable.create();
    private AtomicInteger seqGenerator = new AtomicInteger(0);

    private Map<String, String> header = new TreeMap<>();
    private List<String> columns = new ArrayList<>();

    public void addHeader(String key, String name) {
        header.put(key, name);
        columns.add(key);
    }

    public com.google.common.collect.Table<Integer, String, String> getData() {
        return data;
    }

    public void addRecord(Map<String, String> record) {
        int i = seqGenerator.getAndIncrement();
        for (String column : columns) {
            data.put(i, column, record.get(column));
        }
    }

    public void addRecords(List<Map<String, String>> records) {
        if (records == null) {
            return;
        }
        for (Map<String, String> record : records) {
            addRecord(record);
        }
    }

    public Map<String, String> getRow(Integer number) {
        return data.row(number);
    }

    public Map<Integer, String> getCol(String colKey) {
        return data.column(colKey);
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public List<String> getColumns() {
        return columns;
    }

    public int size() {
        return seqGenerator.get();
    }

}
