public class Retangulo extends FormaGeometrica{

    protected double altura;

    protected double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area(){
        return this.getAltura()*this.getLargura();
    }

    @Override
    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", this.largura, this.altura);
    }
}

