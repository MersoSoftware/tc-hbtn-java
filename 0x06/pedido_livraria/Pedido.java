import java.util.Arrays;
import java.util.List;
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itemPedidos) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }


    public double calcularTotal(){
        double total=0;
        for (ItemPedido itensPedido: itens) {
            total = total + itensPedido.getQuantidade() * itensPedido.getProduto().obterPrecoLiquido();
        }
        return total = total * this.percentualDesconto/100;
    }

}
