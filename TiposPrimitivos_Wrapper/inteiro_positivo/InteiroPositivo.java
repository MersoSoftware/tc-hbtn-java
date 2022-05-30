public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public InteiroPositivo(int valor) {
        this.valor = Integer.parseInt(String.valueOf(valor));
    }

    public void valida() throws Exception {
       if (!(valor % 1 == 0) ){
           throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
       }

    }

    public boolean ehPrimo(){
        if(valor % 1 == 0 && valor % valor == 0){
            return true;
        }
        return false;
    }

    public int getValor() {
        return valor;
    }
}
