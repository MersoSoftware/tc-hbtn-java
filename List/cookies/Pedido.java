import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public List<PedidoCookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookies){
        this.cookies.add(pedidoCookies);
    }

    public Integer obterTotalCaixas(){
        int total= (int) this.cookies.stream().mapToDouble(res -> res.getQuantidadedeCaixas()).sum();
        return total;
    }

    public int removerSabor(String sabor){
        int caixasRemovidas = 0;
        Iterator<PedidoCookie> pedidos = this.cookies.iterator();
        while(pedidos.hasNext()){
            PedidoCookie pedidoCookie = pedidos.next();
            if (pedidoCookie.getSabor().equals(sabor)){
                caixasRemovidas += pedidoCookie.getQuantidadedeCaixas();
                pedidos.remove();
            }
        }

        return caixasRemovidas;
    }

}
