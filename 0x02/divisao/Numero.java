
public class Numero {
    static double resultado;
    public static double dividir(int a, int b){
        try {
           resultado =  a / b;
        }catch (ArithmeticException e){
            System.out.println(" Nao eh possivel dividir por zero ");
        } finally {
            return resultado;
        }

    }
}
