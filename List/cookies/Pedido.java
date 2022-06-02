import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pedido {

    private List<PedidoCookies> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public List<PedidoCookies> getCookies() {
        return cookies;
    }

    public void setCookies(List<PedidoCookies> cookies) {
        this.cookies = cookies;
    }

    public void adicionarPedidoCookie(PedidoCookies pedidoCookies){
        this.cookies.add(pedidoCookies);
    }

    public Integer obterTotalCaixas(){
        int total= (int) this.cookies.stream().mapToDouble(res -> res.getQuantidadedeCaixas()).sum();
        return total;
    }

    public int removerSabor(String sabor){
        int caixasRemovidas = 0;
        Iterator<PedidoCookies> pedidos = this.cookies.iterator();
        while(pedidos.hasNext()){
            PedidoCookies pedidoCookie = pedidos.next();
            if (pedidoCookie.getSabor().equals(sabor)){
                caixasRemovidas += pedidoCookie.getQuantidadedeCaixas();
                pedidos.remove();
            }
        }

        return caixasRemovidas;
    }

}
