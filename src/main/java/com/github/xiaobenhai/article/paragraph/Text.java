package com.github.xiaobenhai.article.paragraph;

/**
 * @author xiaobenhai
 * Date: 2017/3/16
 * Time: 17:13
 */
public class Text implements Paragraph {
    private String content;
    private Type type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        NORMAL(0),
        H1(1),
        H2(2),
        H3(3),
        H4(4),
        H5(5),
        H6(6);

        private int level;

        Type(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }

        public boolean isNormal() {
            return this == NORMAL;
        }
    }
}
