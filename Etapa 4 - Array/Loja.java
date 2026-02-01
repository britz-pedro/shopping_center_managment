public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    // Método construtor 1
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamEstoque];
    }

    // Método construtor 2
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamEstoque];
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEstoqueProduto(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método que retorna os atributos em string
    @Override
    public String toString() {
        return "Nome da Loja: " + nome + "\n" +
                "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário Base dos Funcionários: " + salarioBaseFuncionario + "\n" +
                "Endereço: " + endereco + "\n" +
                "Data de Fundação: " + dataFundacao +
                "Capacidade do estoque: " + estoqueProdutos.length;
    }

    // Método para calcular os gastos com o salário de funcionários
    public int gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    // Método para retornar o tamanho da loja de acordo com a quantidade de
    // funcionários
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P'; // Loja pequena
        } else if (quantidadeFuncionarios <= 30) {
            return 'M'; // Loja média
        } else {
            return 'G'; // Loja grande
        }
    }

    // Método para imprimir todos os produtos
    public void imprimeProdutos() {
        System.out.println("produtos da loja " + nome + ":");

        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println("- " + estoqueProdutos[i]);
            }
        }
    }

    // Método para inserir novos produtos no estoque
    public boolean insereProduto(Produto p) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return false;
    }

    // Método para remover produtos do estoque
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true; // Produto encontrado e removido
            }
        }
        return false; // Produto não encontrado
    }
}
