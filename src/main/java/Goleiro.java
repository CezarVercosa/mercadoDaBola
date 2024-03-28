public class Goleiro extends Jogador{

    int penaltis_defendidos;
    final double ACRESCIMO_GOLEIRO = 0.04;

    public Goleiro(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco, int penaltis_defendidos) {
        super(nome, idade, reputacao_historica, apetite_financeiro, clube_atual, preco);
        this.penaltis_defendidos = penaltis_defendidos;

    }

    public double valorDeCompra() {
        double precoExemplo = this.preco;
        precoExemplo = precoExemplo + this.apetite_financeiro.valor;
        return precoExemplo = penaltis_defendidos * ACRESCIMO_GOLEIRO;

    }
}
