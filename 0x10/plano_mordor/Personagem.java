
public class Personagem {
    protected int pontosDeFelicidade;
    public Humor obterHumorAtual() {
        Humor humor;
        int pontosF = this.pontosDeFelicidade;
        if (pontosF < -5) {
            humor = new Irritado();
        } else if (pontosF > -5 && pontosF < 0) {
            humor = new Triste();
        } else if (pontosF >= 1 && pontosF <= 15) {
            humor = new Feliz();
        } else {
            humor = new MuitoFeliz();
        }

        return humor;
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        String humor = obterHumorAtual().getClass().getSimpleName();
        return this.pontosDeFelicidade + " - " + humor;
    }
}
