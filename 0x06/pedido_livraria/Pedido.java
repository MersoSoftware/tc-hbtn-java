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
        for (ItemPedido itens: itemPedidos) {
            total = total + itens.getQuantidade() * itens.getProduto().obterPrecoLiquido();
        }
        return total = total * this.percentualDesconto/100;
    }
}
