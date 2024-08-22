package variables;

public class PrimitivosCharacter {
    public static void main(String[] args) {
        //a-z A-Z 0-9
        //también se puede usar mapa de caracteres, decimales
        char character = '\u0040';
        char decimal = 64;
        System.out.println("carácter = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = carácter: " + (decimal == character));
        System.out.println("---");

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = carácter: " + (simbolo == character));
        System.out.println("---");

        char espacio = ' ';
        System.out.println("espacio = " + espacio);
        System.out.println("holi" + espacio + "saludos uwu");
        System.out.println("---");

        char espacioUnicode = '\u0020';
        System.out.println("espacioUnicode = " + espacioUnicode);
        System.out.println("---");

        char retroceso = '\b'; //eliminar un caracter
        System.out.println("retroceso =" + retroceso); //elimina el '='
        System.out.println("---");

        char tabulador = '\t';
        System.out.println("tabulador \t = " + tabulador + "uwu");
        System.out.println("---");

        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea + "segunda línea");
        System.out.println("---");

        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro);
        System.out.println("---");

        System.out.println("tipo char corresponde a = " + Character.BYTES + "bytes");
        System.out.println("tipo char puede almacenar en total " + Character.SIZE + " bits");
        System.out.println("valor máximo de un char " + Character.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un char " + Character.MIN_VALUE + " bits");
        System.out.println("---");
    }
}
