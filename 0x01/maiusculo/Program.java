package maiusculo;

public class Program {
    public static void main(String[] args) {

        Caractere caractere = new Caractere();

        boolean caractereEhMaiusculo1 = caractere.EhMaiusculo('a');
        boolean caractereEhMaiusculo2 = caractere.EhMaiusculo('B');
        boolean caractereEhMaiusculo3 = caractere.EhMaiusculo('d');
        boolean caractereEhMaiusculo4 = caractere.EhMaiusculo('f');
        boolean caractereEhMaiusculo5 = caractere.EhMaiusculo('G');

        System.out.printf("%b\n", caractereEhMaiusculo1);
        System.out.printf("%b\n", caractereEhMaiusculo2);
        System.out.printf("%b\n", caractereEhMaiusculo3);
        System.out.printf("%b\n", caractereEhMaiusculo4);
        System.out.printf("%b\n", caractereEhMaiusculo5);
    }
}
