package Modelo;
// classe abstrata
//pedir para essa classe pessoa para implementar a interface

abstract class Pessoa implements PessoaInterface {

    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String cpf;
    protected String cnpj;
    protected String cep;
    protected String telefone;

    /**
     * Essa método contém as regras necessárias para o cnpj na fotmatação
     * correta e também para não dar erro quando o usuário digitar números a
     * mais ou de menos.
     *
     * @return cnpj formatado
     */
    @Override
    public String cnpjFormatado() {
        //esse char trasnforma automaticamente a string em array
        char[] cnpjArray = this.cnpj.toCharArray();
        String cnpjFormato = "";
        //if para não da erro quando digitar números a mais ou a menos.
        if (this.cnpj.length() == 14) {
            /*prenchido manualmente para colocar a foramtação do cnpj
                "" as aspas no inicio é para evitar que some os valores
             */
            cnpjFormato = "" + cnpjArray[0] + cnpjArray[1] + "." + cnpjArray[2] + cnpjArray[3] + cnpjArray[4] + "." + cnpjArray[5] + cnpjArray[6] + cnpjArray[7] + "/" + cnpjArray[8] + cnpjArray[9] + cnpjArray[10] + cnpjArray[11] + "-" + cnpjArray[12] + cnpjArray[13];
        } else {
            cnpjFormato = "CNPJ inválido";
        }

        return cnpjFormato;
    }

    /**
     * Esse método coloca o cep informato pelo usuário na formatação correta.
     * ex: 99.654-789
     *
     * @return cep formatado
     */
    @Override
    public String cepFormatado() {
        //esse char trasnforma automaticamente a string em array
        char[] cepArray = this.cep.toCharArray();

        String cepFormato = "";
        // for para pecorrer as posições do array
        for (int i = 0; i < cepArray.length; i++) {
            //junto cepFormatado e a posição em em cep formatado
            cepFormato = cepFormato + cepArray[i];

            //esses if é para colocar a pontuação na posição correta
            if (i == 1) {
                cepFormato = cepFormato + ".";
            }
            if (i == 4) {
                cepFormato = cepFormato + "-";
            }
        }

        return cepFormato;
    }
    /**
     * Esse método vai colocar o número do telefone na formatação correta.
     * 
     * @return telefone formatado 
     */
    @Override
    public String telefoneFormatado() {
        //esse char trasnforma automaticamente a string em array
        char[] telefoneArray = this.telefone.toCharArray();

        String telefoneFormato = "";
        // for para pecorrer as posições do array
        for (int i = 0; i < telefoneArray.length; i++) {
            //esses if é para colocar a pontuação na posição correta
            if (i == 0) {
                telefoneFormato = telefoneFormato + "(";
            }

            telefoneFormato = telefoneFormato + telefoneArray[i];

            if (i == 1) {
                telefoneFormato = telefoneFormato + ")";
            }
            if (i == 6) {
                telefoneFormato = telefoneFormato + "-";
            }
        }

        return telefoneFormato;
    }

    
    @Override
    public String endereçoCompleto() {
        String endereçoCompleto = endereco + " " + bairro;
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
        if (this.cpf.length() == 11) {
            //preenchaer o array manualmente para coloccar a formatação do cpf
            cpfFormato = "" + cpfArray[0] + cpfArray[1] + cpfArray[2] + "." + cpfArray[3] + cpfArray[4] + cpfArray[5] + "." + cpfArray[6] + cpfArray[7] + cpfArray[8] + "-" + cpfArray[9] + cpfArray[10];
        } else {
            cpfFormato = "CPF inválido";
        }

        return cpfFormato;
    }
    /**
     * Esse método ira colocar as nomes sempre em letra maiuscula.
     * 
     * @return nome maiusculo 
     */
    @Override
    public String nomeMaiusculo() {
        //o "toUpperCase()" - vai retoner em letras maiusculas
        String nomeMaiusculo = this.nome.toUpperCase();
        // o "trim" - remove os espaços embrancos desnecessário.
        nomeMaiusculo = nomeMaiusculo.trim();
        return nomeMaiusculo;
    }
    /**
     * Esse método ira colocar as nomes sempre em letra minuscula.
     * 
     * @return nome minusculo
     */
    @Override
    public String nomeMinusculo() {
        //o "toLowerCase()" - vai retoner em letras maiusculas
        String nomeMinusculo = this.nome.toLowerCase();
        // o "trim" - remove os espaços embrancos desnecessário.
        nomeMinusculo = nomeMinusculo();
        return nomeMinusculo;
    }

}
