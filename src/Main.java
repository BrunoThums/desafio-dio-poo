import br.com.dio.universidade.Universidade;
import br.com.dio.universidade.Curso;
import br.com.dio.universidade.Aluno;
import br.com.dio.universidade.MiniCurso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        MiniCurso miniCurso = new MiniCurso();
        miniCurso.setTitulo("mini curso de java");
        miniCurso.setDescricao("descrição mini curso java");
        miniCurso.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Universidade dio = new Universidade();
        dio.setNome("Bootcamp Java Developer");
        dio.setDescricao("Descrição Bootcamp Java Developer");
        dio.getCursos().add(curso1);
        dio.getCursos().add(curso2);
        dio.getCursos().add(miniCurso);

        Aluno bruno = new Aluno();
        bruno.setNome("Bruno");
        bruno.inscreverCurso(dio);
        System.out.println("Conteúdos Inscritos Bruno:" + bruno.getCursosInscritos());
        bruno.progredir();
        bruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno:" + bruno.getCursosInscritos());
        System.out.println("Conteúdos Concluídos Bruno:" + bruno.getCursosConcluidos());
    }

}
