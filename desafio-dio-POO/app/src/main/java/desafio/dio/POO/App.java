/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package desafio.dio.POO;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descri��o Curso Java");
        curso1.setCargaHoraria(8);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descri��o Mentoria Java");
        mentoria1.setData(LocalDate.now());
        
//        System.out.println(curso1);
//        System.out.println(mentoria1);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devDernei = new Dev();
        devDernei.setNome("Dernei");
        devDernei.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos inscritos Dernei" + devDernei.getConteudosInscritos());
        devDernei.progredir();
        System.out.println("Conte�dos inscritos Dernei" + devDernei.getConteudosInscritos());
        System.out.println("Conte�dos conclu�dos Dernei" + devDernei.getConteudosConcluidos());
        System.out.println("XP:" + devDernei.calcularTotalXp());
        
        
        Dev devEmi = new Dev();
        devEmi.setNome("Emi");
        devEmi.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos inscritos Emi" + devEmi.getConteudosInscritos());
        devEmi.progredir();
        System.out.println("Conte�dos inscritos Emi" + devEmi.getConteudosInscritos());
        System.out.println("Conte�dos conclu�dos Emi" + devEmi.getConteudosConcluidos());
        System.out.println("XP:" + devEmi.calcularTotalXp());
    }
}