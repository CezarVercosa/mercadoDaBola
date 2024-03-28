public class Jogador {

    public String nome;
    public int idade;
    public int reputacao_historica;

    public Apetite apetite_financeiro;
    public Clube clube_atual;
    public double preco;

    public Jogador(String nome, int idade, int reputacao_historica, Apetite apetite_financeiro, Clube clube_atual, double preco) {
        if (reputacao_historica < 0 || reputacao_historica > 10) {
            this.reputacao_historica = 5;
        }
            this.apetite_financeiro = apetite_financeiro;
            this.nome = nome;
            this.reputacao_historica = reputacao_historica;
            this.clube_atual = clube_atual;
            this.preco = preco;
            this.idade = idade;

    }

    public String clubeAtual() {
        if (this.clube_atual == null) {
            return "Sem Clube";
        }
        return clube_atual.nome;
    }

    public boolean temInteresse(Clube clube) {
        if (clube.reputacao_historica < 1) {
            return false;
        }
        return true;
    }

    public double valorDeCompra() {
        return this.preco = this.preco + this.apetite_financeiro.valor;
    }

    public void transferir(Clube clube) {
        this.clube_atual = clube;
    }

}
