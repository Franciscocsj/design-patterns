package br.com.study.patterns.solid.isp;

public class MultiFunctionMachine implements MultiFunctionDevice{

    private Printer printer;
    private Scan scan;

    public MultiFunctionMachine(Printer printer, Scan scan) {
        this.printer = printer;
        this.scan = scan;
    }

    @Override
    public void print(Document d) {
        printer.print(d);

    }

    @Override
    public void scan(Document d) {
        scan.scan(d);
    }
}
