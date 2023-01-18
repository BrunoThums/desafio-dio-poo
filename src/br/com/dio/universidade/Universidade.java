package br.com.dio.universidade;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Universidade {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private Set<Aluno> alunosInscritos = new HashSet<>();
    private Set<Curso> cursos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setConteudos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universidade universidade = (Universidade) o;
        return Objects.equals(nome, universidade.nome) && Objects.equals(descricao, universidade.descricao) && Objects.equals(dataInicial, universidade.dataInicial) && Objects.equals(alunosInscritos, universidade.alunosInscritos) && Objects.equals(cursos, universidade.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, alunosInscritos, cursos);
    }
}

