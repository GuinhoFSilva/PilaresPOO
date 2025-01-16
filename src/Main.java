import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso("Bootcamp Java", "Um bootcamp de Java feito pela DIO em parceria com o banco Santander", 84);
        
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Desc mentoria java", LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp("Bootcamp Java", "Descrição incrível");

        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(curso1);

        Dev dev1 = new Dev("Gui");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        dev1.progredir();
        System.out.println(" O dev " + dev1.getNome() + " está matrículado nos seguintes conteúdos: " + dev1.getConteudosInscritos());
        System.out.println("==============================================");
        System.out.println(" O dev " + dev1.getNome() + " concluiu os seguintes conteúdos: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos não concluídos: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularXpTotal());
        System.out.println("==============================================");
        
        
        
        Dev dev2 = new Dev("Fonseca");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println(" O dev " + dev2.getNome() + " está matrículado nos seguintes conteúdos: " + dev2.getConteudosInscritos());
        System.out.println("==============================================");
        System.out.println(" O dev " + dev2.getNome() + " concluiu os seguintes conteúdos: " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos não concluídos: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularXpTotal());
        System.out.println("==============================================");

        

    }
}
