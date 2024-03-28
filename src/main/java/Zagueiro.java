public class Zagueiro extends Jogador {
    final double DESCONTO_ZAGUEIRO = 0.20;

    public Zagueiro(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco) {
        super(nome, idade, reputacao_historica, apetite_financeiro, clube_atual, preco);

    }

    public double valorDeCompra() {
        double precoExemplo = this.preco;
        if (this.idade > 30) {
            precoExemplo = precoExemplo + this.apetite_financeiro.valor;
            return precoExemplo = precoExemplo * DESCONTO_ZAGUEIRO;
        }
        return precoExemplo = precoExemplo + this.apetite_financeiro.valor;
    }

}
