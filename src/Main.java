import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso("Bootcamp Java", "Um bootcamp de Java feito pela DIO em parceria com o banco Santander", 84);
        
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Desc mentoria java", LocalDate.now());
        
        System.out.println(mentoria1.getDescricao());
        System.out.println(curso1);
        System.out.println(mentoria1);

        

    }
}
