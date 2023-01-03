package br.com.study.patterns.solid.ocp;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
