
package javaapplication15;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("093.183.000-09", "08923442", LocalDate.of(2002, Month.MARCH, 23), 344, 423, "Luna", Genero.FEMININO, new Endereco("Alamendas Sulth", "098", "quadra 988", "76765-897", "Curitiba", "PR"));
        Juridico juridico = new Juridico("09890809889", "0912128", LocalDate.of(2003, Month.MARCH, 13), LocalDate.of(2020, Month.MARCH, 20), 987, 23, "Magalu", Genero.MASCULINO, new Endereco("Yamuja", "87", "Prisma", "66666-666", "Yaoshi", "YA"));
        
        
        System.out.println(juridico.toString());
        System.out.println(funcionario.toString());
    }
    
}
