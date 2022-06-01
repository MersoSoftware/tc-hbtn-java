import java.util.List;

public class ManipularArrayNumeros {

    public static Integer buscarPosicaoNumero(List<Integer> numeros, Integer numero){
        if(numeros.contains(numero)){
            return numeros.indexOf(numero);
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> numeros, Integer numero) throws Exception {
        if (numeros.contains(numero)){
            throw  new Exception("Numero jah contido na lista");
        }
        numeros.add(numero);
    }

    public static  void removerNumero(List<Integer> numeros, Integer numero) throws Exception {
      Integer numeroRemover = buscarPosicaoNumero(numeros, numero);

        if(numeroRemover== -1){
            throw new Exception("Numero nao encontrado na lista");
        }
        numeros.remove(numero);
    }


    public static void substituirNumero(List<Integer> list, Integer numeroSubstituir, Integer numeroSubstituto) {
        int posicaoNumero = buscarPosicaoNumero(list,numeroSubstituir);

        if (posicaoNumero == -1) {
            list.add(numeroSubstituto);
        } else {
            list.set(posicaoNumero, numeroSubstituto);
        }
    }



}
