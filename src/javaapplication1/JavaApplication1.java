
package javaapplication1;

import Modelo.Funcionario;
import Modelo.Gerente;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        //criando funcionário
        Funcionario f = new Funcionario();
        f.setNome("Márcio");
        f.setCpf("45678912396");
        f.setCep("03795071000116");
        f.setTelefone("47256251536");
        f.setSalario(500);
        
        //criar gerente
        Gerente g = new Gerente();
        g.setNome("       Daniel     ");
        g.setTelefone("47256251536");
        g.setCpf("78945612378");
        g.setCnpj("03795071000116");
        f.setSalario(500);
        g.setNumFuncGerenciados(10);
        
        //com o "final" não pode alterar o valor da varial;
        final String senhaDB = "DKASJ";
        
        System.out.println("Dados do funcionáro: ");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Telefone: " + f.telefoneFormatado());
        System.out.println("CPF: " + f.cpfFormatado());
        System.out.println("CEP: "+ f.cepFormatado());
        System.out.println("Salario: " + f.getSalario());
        System.out.println("Bonificação: " + f.getBonificacao());
        System.out.println("---------------");
        System.out.println("Dados do gerente: ");
        System.out.println("Nome: " + g.getNome());
        System.out.println("CPF: " + g.cpfFormatado());
        System.out.println("CNPJ: " + g.cnpjFormatado());
        System.out.println("Salario: " + g.getSalario());
        System.out.println("Bonificação: " + g.getBonificacao());
        System.out.println("Número funcionário: " + g.getNumFuncGerenciados());
        System.out.println("Nome maiusculo: "+g.nomeMaiusculo());
        

        //jogando a classe gerente dentro da classe funcionário, e isso funciona pq as duas são compativeis
        Funcionario geretenTeste = g;
        System.out.println("----------------------");
        System.out.println("Gerente teste");
        System.out.println("Nome: " + geretenTeste.getNome());
        System.out.println("CPF: " + geretenTeste.getCpf());
    }
    
}
