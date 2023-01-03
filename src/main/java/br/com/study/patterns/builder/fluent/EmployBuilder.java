package br.com.study.patterns.builder.fluent;

public class EmployBuilder extends PersonBuilder<EmployBuilder> {

    public EmployBuilder workAt(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployBuilder self() {
        return this;
    }
}
