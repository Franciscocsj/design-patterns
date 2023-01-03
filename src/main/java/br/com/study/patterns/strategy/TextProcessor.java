package br.com.study.patterns.strategy;

import java.util.List;

public class TextProcessor {
    private final StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public TextProcessor(OutPutFormat format) {
        setOutPutFormat(format);
    }

    public void setOutPutFormat(OutPutFormat format) {
        switch (format) {
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();
                break;
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
        }
    }

    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for (String item : items) {
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
