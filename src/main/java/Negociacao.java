public class Negociacao {

    public boolean negociar(Clube clubeInteressado, Jogador jogadorDeInteresse) {
        if (jogadorDeInteresse.temInteresse(clubeInteressado) == true) {
            if (clubeInteressado.saldo >= jogadorDeInteresse.preco) {
                jogadorDeInteresse.transferir(clubeInteressado);
                clubeInteressado.saldo = clubeInteressado.saldo - jogadorDeInteresse.preco;
                return true;
            }
            return false;
        }
        return false;
    }
}
