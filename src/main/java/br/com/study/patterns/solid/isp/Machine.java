package br.com.study.patterns.solid.isp;

public interface Machine {

    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
