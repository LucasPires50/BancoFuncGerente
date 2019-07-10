
package Modelo;

//classe estendida 
public class Gerente extends Funcionario {
    
    private int numFuncGerenciados;
    private int senha;
   
    

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return this.numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }
    
    
    /**
     *Reescrevendo o metodo getNome
     * 
     * @return nome + "(gerente)"
     */
    @Override
    public String getNome(){
        return this.nome + "(gerente)";
    }
    
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
                
    }
    // métodos sempre tem os parenteses, atributos já não tem.
    public double getBonificacao (double plus, double recompesnsa){
        double bonificacao = this.getBonificacao();
        return bonificacao + plus;
    }
}
