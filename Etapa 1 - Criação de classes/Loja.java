public class Loja {
    private String nome; 
    private int quantidadeFuncionarios; 
    private int salarioBaseFuncionario;

    //Método construtor 1 
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //Método construtor 2
    public Loja (String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
    
    //Método que retorna os atributos em string
    @Override
    public String toString(){
         return"Loja: "+nome+
         "\n Quantidade de funcionários: "+quantidadeFuncionarios+
         "\n Salário base: R$"+salarioBaseFuncionario+"\n";
    }

    //Método para calcular os gastos com o salário de funcionários
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1)
            return -1;
        else
            return (salarioBaseFuncionario * quantidadeFuncionarios);
    }

    //Método para retornar o tamanho da loja de acordo com a quantidade de funcionários
    public char tamanhoDaLoja (){
        if (quantidadeFuncionarios < 10)
            return 'P'; 
        else if (quantidadeFuncionarios <=30)
            return 'M'; 
        else 
            return 'G'; 

    }
}