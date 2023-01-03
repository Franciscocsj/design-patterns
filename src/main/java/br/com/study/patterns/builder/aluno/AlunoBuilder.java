package br.com.study.patterns.builder.aluno;

public class AlunoBuilder {

    private final Aluno aluno;

    /**
     * Cria uma instancia para o objeto Aluno.
    **/
    public AlunoBuilder() {
        this.aluno = new Aluno();
    }

    /**
     * Cria uma instancia para o objeto AlunoBuilder.
     **/
    public static AlunoBuilder builder() {
        return new AlunoBuilder();
    }

    /**
     * Adiciona ao objeto aluno o valor do id.
     * @param id
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder id(long id) {
        this.aluno.setId(id);
        return this;
    }

    /**
     * Adiciona ao objeto aluno o valor do nome.
     * @param nome
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder nome(String nome) {
        this.aluno.setNome(nome);
        return this;
    }

    /**
     * Adiciona ao objeto aluno o valor do sobrenome.
     * @param sobrenome
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder sobrenome(String sobrenome) {
        this.aluno.setSobrenome(sobrenome);
        return this;
    }

    /**
     * Adiciona ao objeto aluno o valor da idade.
     * @param idade
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder idade(int idade) {
        this.aluno.setIdade(idade);
        return this;
    }

    /**
     * Adiciona ao objeto aluno o valor da matricula.
     * @param matricula
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder matricula(long matricula) {
        this.aluno.setMatricula(matricula);
        return this;
    }

    /**
     * Adiciona ao objeto aluno o sexo.
     * @param sexo
     * @return retorna a instancia atual da classe AlunoBuilder
     **/
    public AlunoBuilder sexo(char sexo) {
        this.aluno.setSexo(sexo);
        return this;
    }

    public Aluno build() {
        return this.aluno;
    }
}
