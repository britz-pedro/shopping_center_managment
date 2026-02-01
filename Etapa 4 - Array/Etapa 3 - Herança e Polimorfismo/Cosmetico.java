public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
    Data dataDeFundacao,int tamEstoque, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, tamEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nTaxa de comercialização: %.2f", taxaComercializacao);
    }
}