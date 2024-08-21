package variables;

public class PrimitivosCharacter {
    public static void main(String[] args) {
        //a-z A-Z 0-9
        //también se puede usar mapa de caracteres, decimales
        char character = 'a';
        System.out.println("carácter = " + character);
        System.out.println("tipo char corresponde a = " + Character.BYTES + "bytes");
        System.out.println("tipo char puede almacenar en total " + Character.SIZE + " bits");
        System.out.println("valor máximo de un char " + Character.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un char " + Character.MIN_VALUE + " bits");
        System.out.println("---");
    }
}
