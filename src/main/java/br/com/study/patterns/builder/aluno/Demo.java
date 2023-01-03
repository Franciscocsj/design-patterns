package br.com.study.patterns.builder.aluno;

public class Demo {

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
