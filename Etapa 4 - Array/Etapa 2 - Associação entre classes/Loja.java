public class Loja {
    private String nome; 
    private int quantidadeFuncionarios; 
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;

    //Método construtor 1 
    public Loja (String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }

    //Método construtor 2
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }

    public Data getDataDeFundacao(){
        return dataDeFundacao;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataDeFundacao(Data dataDeFundacao){
        this.dataDeFundacao = dataDeFundacao;
    }

    //Método que retorna os atributos em string
    @Override
    public String toString(){
        return "Nome da Loja: " + nome + "\n" +
           "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
           "Salário Base dos Funcionários: " + salarioBaseFuncionario + "\n";
    }

    //Método para calcular os gastos com o salário de funcionários
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        else{
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    //Método para retornar o tamanho da loja de acordo com a quantidade de funcionários
    public char tamanhoDaLoja (){
        if (quantidadeFuncionarios < 10){
            return 'P'; //Loja pequena
        }
        else if (quantidadeFuncionarios <=30){
            return 'M'; //Loja média
        }
        else {
            return 'G'; //Loja grande
        }
    }
}