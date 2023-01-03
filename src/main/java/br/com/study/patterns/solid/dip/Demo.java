package br.com.study.patterns.solid.dip;

public class Demo {

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Cris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}
