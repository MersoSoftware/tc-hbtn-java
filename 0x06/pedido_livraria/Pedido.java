import java.util.Arrays;
import java.util.List;


    private double percentualDesconto;public class Pedido {


        private ItemPedido[]itemPedidos;

    public Pedido(double percentualDesconto, ItemPedido[] itemPedidos) {
        this.percentualDesconto = percentualDesconto;
        this.itemPedidos = itemPedidos;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularTotal(){
        double total=0;
        for (ItemPedido itens: itemPedidos) {
            total = total + itens.getQuantidade() * itens.getProduto().obterPrecoLiquido();
        }
        return total = total * this.getPercentualDesconto()/100;
    }
}
