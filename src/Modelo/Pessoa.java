package Modelo;
// classe abstrata
    //pedir para essa classe pessoa para implementar a interface
abstract class Pessoa implements PessoaInterface{
    
    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String cpf;

    //metodos implementados
    @Override
    public String endereçoCompleto() {
       String endereçoCompleto = endereco +" "+ bairro;
       return endereçoCompleto;
    }

    @Override
    public String cpfFormatado() {
        String[] cpf = new String[11];
            
        
        cpf[0] = "";
        cpf[1] = "";
        cpf[2] = "";
        cpf[3] = "";
        cpf[4] = "";
        cpf[5] = "";
        cpf[6] = "";
        cpf[7] = "";
        cpf[8] = "";
        cpf[9] = "";
        cpf[10] = "";
        
        String cpfFormato =  cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"-"+cpf[9]+cpf[10];
        
        return cpfFormato;
    }

    @Override
    public String nomeMaiusculo() {
        //o "toUpperCase()" - vai retoner em letras maiusculas
        String nomeMaiusculo = this.nome.toUpperCase();
        // o "trim" - remove os espaços embrancos desnecessário.
        nomeMaiusculo = nomeMaiusculo.trim();
        return nomeMaiusculo;
    }

    @Override
    public String nomeMinusculo() {
        //o "toLowerCase()" - vai retoner em letras maiusculas
        String nomeMinusculo = this.nome.toLowerCase();
        // o "trim" - remove os espaços embrancos desnecessário.
        nomeMinusculo = nomeMinusculo();
        return nomeMinusculo;
    }
    

    
    
    
    
}
