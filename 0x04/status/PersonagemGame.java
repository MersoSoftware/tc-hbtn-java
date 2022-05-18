public class PersonagemGame {

    public int saudeAtual;
    public String nome;

    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual > 0){
            status = "vivo";
        }
        if(saudeAtual == 0){
            status = "morto";
        }

        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano (int quantidadeDeDano){
        this.saudeAtual-= quantidadeDeDano;
        if(this.saudeAtual <= 0){
            this.setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura){
        this.saudeAtual += quantidadeDeCura;
        if(this.saudeAtual >= 100){
            this.setSaudeAtual(100);
        }
    }

    public String getStatus() {
        return status;
    }
}
