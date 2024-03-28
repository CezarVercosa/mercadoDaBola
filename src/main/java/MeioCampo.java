public class MeioCampo extends Jogador{
    final double DESCONTO_MEIOCAMPO = 0.30;

    public MeioCampo(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco) {
        super(nome, idade, reputacao_historica, apetite_financeiro, clube_atual, preco);

    }

    public double valorDeCompra() {
        double precoExemplo = this.preco;
        if (this.idade > 30) {
            precoExemplo = precoExemplo + this.apetite_financeiro.valor;
            return precoExemplo = precoExemplo * DESCONTO_MEIOCAMPO;
        } else {
            return precoExemplo = precoExemplo + this.apetite_financeiro.valor;
        }


    }
    public boolean temInteresse(Clube clube) {
        if ((clube.reputacao_historica - this.reputacao_historica) == 2) {
            return false;
        }
        return true;
    }
}
