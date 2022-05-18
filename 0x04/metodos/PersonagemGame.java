public class PersonagemGame {

    public int saudeAtual;
    public String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano (int quantidadeDeDano){
        if(this.saudeAtual > 0 && this.saudeAtual < 100){
            this.saudeAtual-= quantidadeDeDano;
        }
    }

    public void receberCura(int quantidadeDeCura){
        if(this.saudeAtual < 100){
            this.saudeAtual += quantidadeDeCura;
        }
    }
}
