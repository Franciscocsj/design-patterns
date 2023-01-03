package br.com;

public class Main {

    public static void main(String[] args) {

        boolean meuBife = isBifeAcebolado("contra", "cebola");

        System.out.println("Meu bife é acebolado: " + meuBife);
    }

    public static boolean isBifeAcebolado(String carne, String legume) {
        String bife = "contra";
        String complemento = "cebola";

        return (bife.equals(carne) && complemento.equals(legume));
    }
}