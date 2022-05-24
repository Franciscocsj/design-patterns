package main.java.br.com.study.patterns.builder;

import main.java.br.com.study.patterns.builder.Aluno;
import main.java.br.com.study.patterns.builder.AlunoBuilder;

public class CadastroAluno {

    public static void main(String[] args) {
        Aluno aluno = AlunoBuilder.builder()
                .id(32221236L)
                .nome("Alice")
                .sobrenome("dos Santos")
                .idade(27)
                .matricula(99623632L)
                .sexo('F')
                .build();

        System.out.println(aluno.toString());
    }
}
