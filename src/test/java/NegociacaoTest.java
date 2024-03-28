import org.junit.Test;
import org.junit.Assert;

public class NegociacaoTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, 100000000);
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, 8, new Indiferente(), null, 800500, 12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 100000000);
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, 10, new Indiferente(), null, 800500, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 100000000);
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, 10, new Indiferente(), null, 800500000, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 100000000);
        MeioCampo meioCampo = new MeioCampo("Cristiano Ronaldo", 24, 10, new Indiferente(), null, 800500);

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);
        double precoFinal = meioCampo.valorDeCompra();

        Assert.assertEquals(precoFinal, meioCampo.preco, 0.01);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 100000000);
        MeioCampo meioCampo = new MeioCampo("Cristiano Ronaldo", 35, 10, new Indiferente(), null, 800500);

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);
        double precoFinal = meioCampo.valorDeCompra();
        double precoTeste = meioCampo.preco * 0.30;

        Assert.assertEquals(precoFinal, precoTeste, 0.01);
    }



}
