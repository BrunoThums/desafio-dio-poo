package br.com.dio.universidade;
import java.util.*;

public class Aluno {
    private String nome;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();

    public void inscreverCurso(Universidade universidade){
        this.cursosInscritos.addAll(universidade.getCursos());
        universidade.getAlunosInscritos().add(this);
    }

    public void progredir() {
        Optional<Curso> curso = this.cursosInscritos.stream().findFirst();
        if(curso.isPresent()) {
            this.cursosConcluidos.add(curso.get());
            this.cursosInscritos.remove(curso.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(cursosInscritos, aluno.cursosInscritos) && Objects.equals(cursosConcluidos, aluno.cursosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursosInscritos, cursosConcluidos);
    }
}
