import br.com.dio.desafio.domínio.Curso;
import br.com.dio.desafio.domínio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java" );
        curso1.getDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js" );
        curso2.getDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria() {
            @Override
            public double calcularXp() {
                return 0;
            }
        };
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
