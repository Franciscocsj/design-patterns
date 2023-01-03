package br.com.study.patterns.solid.dip;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
