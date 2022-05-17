public class ContaBancariaBasica {
    String numeracao;
    double saldo;
    double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }else{
            this.saldo += valor;
        }
    }

    public void sacar (double valor) throws OperacaoInvalidaException {
        if(valor <=0 ){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        if(valor > saldo){
           throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calCularTarifaMensal(){
        double tarifa = this.saldo*0.1;

        if (tarifa > 10) {
            return 10;
        } else{
            return tarifa;
        }
    }
    public double calcularJurosMensal(){
        double juros = 0;
        if (saldo > 0){
            juros = this.saldo * ((this.taxaJurosAnual/12) / 100);
        }
        return juros;
    }
    void aplicarAtualizacaoMensal(){
        double tarifaMensal = calCularTarifaMensal();
        double jurosMensal = calcularJurosMensal();
        saldo = saldo - tarifaMensal;
        saldo += jurosMensal;
    }


}
