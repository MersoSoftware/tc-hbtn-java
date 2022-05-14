package maiusculo;

public class Caractere {


    public static boolean EhMaiusculo(char valor){

        if(!Character.isLowerCase(valor)){
            return true;
        }else{
            return false;
        }
    }

}
