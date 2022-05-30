public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(String valor) {
        int value = Integer.parseInt(valor);

        if (value < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = value;
    }

    public InteiroPositivo(int valor) {
        this.valor = Integer.parseInt(String.valueOf(valor));
    }

    public boolean ehPrimo(){
        if(valor <= 1){
            return false;
        }
        for (int i =2; i < valor; i++){
            if (valor % i ==0){
                return false;
            }
        }
        return true;
    }

    public void setValor(int valor) {
        if (valor <  1  ){
            throw new NumberFormatException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
