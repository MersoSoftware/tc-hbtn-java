public class PedidoCookie {

    private String sabor;

    private int quantidadedeCaixas;

    public PedidoCookie(String sabor, int quantidadedeCaixas) {
        this.sabor = sabor;
        this.quantidadedeCaixas = quantidadedeCaixas;
    }


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadedeCaixas() {
        return quantidadedeCaixas;
    }

    public void setQuantidadedeCaixas(int quantidadedeCaixas) {
        this.quantidadedeCaixas = quantidadedeCaixas;
    }
}
