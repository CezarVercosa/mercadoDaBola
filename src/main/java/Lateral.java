public class Lateral extends Jogador{
    int cruzamentos_certeiros;
    final double ACRESCIMO_LATERAL = 0.02;
    final double DESCONTO_LATERAL = 0.30;

    public Lateral(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco, int cruzamentos_certeiros) {
        super(nome, idade, reputacao_historica, apetite_financeiro, clube_atual, preco);
        this.cruzamentos_certeiros = cruzamentos_certeiros;

    }

    public double valorDeCompra() {
        double precoExemplo = this.preco;
        precoExemplo = cruzamentos_certeiros * ACRESCIMO_LATERAL;
        if (this.idade > 28) {
            precoExemplo = precoExemplo + this.apetite_financeiro.valor;
            return precoExemplo = precoExemplo * DESCONTO_LATERAL;
        }
        return this.preco = this.preco + this.apetite_financeiro.valor;
    }
}
