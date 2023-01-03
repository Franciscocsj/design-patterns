package br.com.study.patterns.builder.fluent;

public class Demo {

    public static void main(String[] args) {
        EmployBuilder pb = new EmployBuilder();
        Person xico = pb
                .withName("Xico")
                .workAt("Developer")
                .build();

        System.out.println(xico);
    }
}
