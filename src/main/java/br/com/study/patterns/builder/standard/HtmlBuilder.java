package br.com.study.patterns.builder.standard;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    /*
    * Interface Fluente
    * * Ao transformar o método void addChild em um construtor
    * eu posso fazer ele retornar  um referencia ao componente especifico
    * e remover a chamada do contrutor no método que está chamando o construtor
     * */
    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);

        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
