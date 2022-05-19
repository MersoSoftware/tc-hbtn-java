public class Quadrado extends Retangulo{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(this.lado < 0){
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
    }

    @Override
    public double area(){
        return this.lado * this.lado;
    }

    public String toString(){
        return "[Quadrado] " + String.format("%.2f", lado);
    }


}
