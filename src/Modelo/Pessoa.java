package Modelo;
// classe abstrata
    //pedir para essa classe pessoa para implementar a interface
abstract class Pessoa implements PessoaInterface{
    
    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String cpf;
    protected String cnpj;
    protected String cep;
    protected String telefone;
    
    @Override
    public String cnpjFormatado() {
        char[] cnpjArray = this.cnpj.toCharArray();
        String cnpjFormato = "";
   
            if (this.cnpj.length()== 11){
            cnpjFormato = ""+cnpjArray[0]+cnpjArray[1]+"."+cnpjArray[2]+cnpjArray[3]+cnpjArray[4]+"."+cnpjArray[5]+cnpjArray[6]+cnpjArray[7]+"/"+cnpjArray[8]+cnpjArray[9]+cnpjArray[10]+cnpjArray[11]+"-"+cnpjArray[12]+cnpjArray[13];
        }else{
             cnpjFormato = "CNPJ inválido";  
        }
        
        
        return cnpjFormato;    }

    @Override
    public String cepFormatado() {
        char[] cepArray = this.cep.toCharArray();
        
        String cepFormato = "";
        
        for (int i = 0; i < cepArray.length; i++){
            cepFormato = cepFormato + cepArray[i];
            
            if(i == 1 ){
                cepFormato = cepFormato+".";
            }
            if(i == 4 ){
                cepFormato = cepFormato+"-";
            }
        }
        
        return cepFormato;
    }

    @Override
    public String telefoneFormatado() {
       char[] telefoneArray = this.telefone.toCharArray();
        
        String telefoneFormato = "";
        
        for (int i = 0; i < telefoneArray.length; i++){
             if(i == 0  ){
                telefoneFormato = telefoneFormato+"(";
            }
            
            telefoneFormato = telefoneFormato + telefoneArray[i];
            
           
            if(i == 1){
                telefoneFormato = telefoneFormato+")";
            }
            if(i == 6 ){
                telefoneFormato = telefoneFormato+"-";
            }
        }
        
        return telefoneFormato;
    }
   

    //metodos implementados
    @Override
    public String endereçoCompleto() {
       String endereçoCompleto = endereco +" "+ bairro;
       return endereçoCompleto;
    }
  
    /**
     * esse metodo ira colocar o cpf na formatação correta xxx.xxx.xxx-xx
     * 
     * @return retorna o cpf formatado
     */
    @Override
    public String cpfFormatado() {
       //converte o cpf infoprmado para array
       char[] cpfArray = this.cpf.toCharArray();
       String cpfFormato = "";
    
           //if para não da erro, quando colocar númeors a mais ou a menos. 
             if (this.cpf.length()== 11){
                //preenchaer o array manualmente para coloccar a formatação do cpf
                cpfFormato = ""+cpfArray[0]+cpfArray[1]+cpfArray[2]+"."+cpfArray[3]+cpfArray[4]+cpfArray[5]+"."+cpfArray[6]+cpfArray[7]+cpfArray[8]+"-"+cpfArray[9]+cpfArray[10];
             }else{
                cpfFormato = "CPF inválido";
             }    
    
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
