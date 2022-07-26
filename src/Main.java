import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
     Curso curso1 = new Curso();
        curso1.setTiutulo("curso java");
        curso1.setDescricao("curso de POO");
        curso1.setCargaHoraria(120);

     Curso curso2 = new Curso();
        curso2.setDescricao("curso JavaScript");
        curso2.setDescricao("curso basico de JS");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria sobre POO");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
