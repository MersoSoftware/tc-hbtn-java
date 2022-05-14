package maiusculo;

public class Caractere {


    public static boolean EhMaiusculo(char valor){

        if(Character.isUpperCase(valor)){
            return true;
        }else{
            return false;
        }
    }

}
