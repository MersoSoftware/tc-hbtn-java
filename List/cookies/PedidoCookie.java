import java.util.List;

public class PedidoCookie {

    private String sabor;

    private int quantidadeCaixas;


    public PedidoCookie(String sabor, int quantidadedeCaixas) {
        this.sabor = sabor;
        this.quantidadeCaixas = quantidadedeCaixas;
    }


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadedeCaixas() {
        return quantidadeCaixas;
    }

    public void setQuantidadedeCaixas(int quantidadedeCaixas) {
        this.quantidadeCaixas = quantidadedeCaixas;
    }
}
