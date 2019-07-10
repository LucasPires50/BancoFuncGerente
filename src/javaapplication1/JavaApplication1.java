
package javaapplication1;

import Modelo.Funcionario;
import Modelo.Gerente;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        //criando funcionário
        Funcionario f = new Funcionario();
        f.setNome("Márcio");
        f.setCpf("54676587687");
        f.setSalario(500);
        
        //criar gerente
        Gerente g = new Gerente();
        g.setNome("Daniel");
        g.setCpf("789456123");
        f.setSalario(500);
        g.setNumFuncGerenciados(10);
        
        //com o "final" não pode alterar o valor da varial;
        final String senhaDB = "DKASJ";
        
        System.out.println("Dados do funcionáro: ");
        System.out.println("Nome: " + f.getNome());
        System.out.println("CPF: " + f.getCpf());
        System.out.println("Salario: " + f.getSalario());
        System.out.println("Bonificação: " + f.getBonificacao());
        System.out.println("---------------");
        System.out.println("Dados do gerente: ");
        System.out.println("Nome: " + g.getNome());
        System.out.println("CPF: " + g.getCpf());
        System.out.println("Salario: " + g.getSalario());
        System.out.println("Bonificação: " + g.getBonificacao());
        System.out.println("Número funcionário: " + g.getNumFuncGerenciados());

        //jogando a classe gerente dentro da classe funcionário, e isso funciona pq as duas são compativeis
        Funcionario geretenTeste = g;
        System.out.println("----------------------");
        System.out.println("Gerente teste");
        System.out.println("Nome: " + geretenTeste.getNome());
        System.out.println("CPF: " + geretenTeste.getCpf());
    }
    
}
