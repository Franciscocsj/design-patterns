package br.com.study.patterns.solid.lsp;

public class Demo {

    static void userIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);

        System.out.println(
                "Expected area of " + (width * 10) + ", got " + r.getArea()
        );
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3);
        userIt(rc);

        Rectangle sq = new Square();
        sq.setWidth(5);
        userIt(sq);
    }


}
