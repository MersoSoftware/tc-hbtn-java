public class Tarefa {

    private String descricao;

    private boolean estahFeita;

    private int identificador;

    public Tarefa(String descricao,  int identificador) {
        modificarDescricao(descricao);
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void  modificarDescricao(String texto) {
        if(texto == null || texto.isBlank() || texto.isEmpty()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
         this.setDescricao(texto);
    }
}
