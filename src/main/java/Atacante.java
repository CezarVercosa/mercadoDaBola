public class Atacante extends Jogador{

    int gols_no_ano;
    final double ACRESCIMO_ATACANTE = 0.01;
    final double DESCONTO_ATACANTE = 0.25;

    public Atacante(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco, int gols_no_ano) {
        super(nome, idade, reputacao_historica, apetite_financeiro, clube_atual, preco);
        this.gols_no_ano = gols_no_ano;

    }

    public double valorDeCompra() {
        double precoExemplo = this.preco;
        precoExemplo = gols_no_ano * ACRESCIMO_ATACANTE;
        if (this.idade > 30) {
            precoExemplo = precoExemplo + this.apetite_financeiro.valor;
            return precoExemplo = precoExemplo * DESCONTO_ATACANTE;
        }
        return precoExemplo = precoExemplo + this.apetite_financeiro.valor;
    }

    public boolean temInteresse(Clube clube) {
        if (clube.reputacao_historica < this.reputacao_historica) {
            return false;
        }
        return true;
    }
}
