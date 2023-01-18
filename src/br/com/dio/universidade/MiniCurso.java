package br.com.dio.universidade;

import java.time.LocalDate;

public class MiniCurso extends Curso{

    private LocalDate data;
    
    public MiniCurso() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
    
}
