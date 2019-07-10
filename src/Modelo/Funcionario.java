
package Modelo;

public class Funcionario {
    
       protected String nome;
       protected String cpf;
       protected double salario;
       protected double Bonificacao;

    public double getBonificacao() {
        return this.salario * 0.10;
    }
        //polimorfismo
        public double getBonificacao(double plus) {
        return (this.salario * 0.10) + plus;
        
    }
    // o "VOID" não retorna nada, ele só executa o que tem dentro dele, mas não da retorno.    
    public void setBonificacao(double Bonificacao) {
        this.Bonificacao = Bonificacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
