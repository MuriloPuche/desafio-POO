import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
     Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de POO");
        curso1.setCargaHoraria(120);

     Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("curso basico de JS");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria sobre POO");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Iniciante de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Murilo:" + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        System.out.println("Conteúdos Inscritos de Murilo:" + devMurilo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Murilo:" + devMurilo.getConteudosConcluidos());
        System.out.println("XP " + devMurilo.calcularXp());

        System.out.println("------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteúdos Inscritos de Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Pedro:" + devMurilo.getConteudosConcluidos());
        System.out.println("XP " + devMurilo.calcularXp());
    }


}
