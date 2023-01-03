package br.com.study.patterns.builder.aluno;

import java.util.Objects;

public class Aluno {

    private long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private long matricula;
    private char sexo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  " id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", sexo=" + sexo;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Aluno aluno) {
            return Objects.equals(aluno.nome, this.nome) && Objects.equals(aluno.sobrenome, this.sobrenome);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getNome().length() * 13;
    }
}
