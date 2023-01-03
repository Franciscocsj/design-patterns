package br.com.study.patterns.strategy;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutPutFormat.MARKDOWN);
        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        tp.clear();
        tp.setOutPutFormat(OutPutFormat.HTML);
        tp.appendList(List.of("inheritance", "encasulation," +
                "polymorphismo"));

        System.out.println(tp);
    }
}
