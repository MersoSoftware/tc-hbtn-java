
public class Numero {
    static double resultado;
    public static void dividir(int a, int b){
        try {
           resultado =  a / b;
        }catch (ArithmeticException e){
            System.out.println(" Nao eh possivel dividir por zero ");
        } finally {

            System.out.println(a + " / " + b + " = " + resultado);

        }

    }
}
