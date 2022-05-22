package produtos;

public abstract class Produto {

    protected String titulo;

    protected int ano;

    protected String pais;

    protected double precoBruto;

    public Produto(String titulo, int ano, String pais) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
    }


    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public abstract double obterPrecoLiquido();
}
