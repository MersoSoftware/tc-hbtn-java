public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public InteiroPositivo(int valor) {
        this.valor = Integer.parseInt(String.valueOf(valor));
    }

//    public void valida() throws Exception {
//
//    }

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
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
