package variables;

public class Primitivos {
    public void tiposDatos() {
        byte numByte = 127;
        System.out.println("numByte = " + numByte);
        System.out.println("tipo byte corresponde a = " + Byte.BYTES + "bytes");
        System.out.println("tipo byte puede almacenar en total " + Byte.SIZE + " bits");
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un byte " + Byte.MIN_VALUE + " bits");
        System.out.println("---");

        short numShort = 32767;
        System.out.println("numShort = " + numShort);
        System.out.println("tipo short corresponde a = " + Short.BYTES + "bytes");
        System.out.println("tipo short puede almacenar en total " + Short.SIZE + " bits");
        System.out.println("valor máximo de un short " + Short.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un short " + Short.MIN_VALUE + " bits");
        System.out.println("---");

        int numInt = 327698987;
        System.out.println("numInt = " + numInt);
        System.out.println("tipo int corresponde a = " + Integer.BYTES + "bytes");
        System.out.println("tipo int puede almacenar en total " + Integer.SIZE + " bits");
        System.out.println("valor máximo de un int " + Integer.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un int " + Integer.MIN_VALUE + " bits");
        System.out.println("---");

        long numLong = 9223372036854775807L;
        System.out.println("numLong = " + numLong);
        System.out.println("tipo long corresponde a = " + Long.BYTES + "bytes");
        System.out.println("tipo long puede almacenar en total " + Long.SIZE + " bits");
        System.out.println("valor máximo de un long " + Long.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un long " + Long.MIN_VALUE + " bits");
        System.out.println("---");

        //e -> exponente, cuantas veces se mueve la coma a la derecha
        //3.5e4f = 35000.0
        //3.5e-4f = 0.00035
        float numFloat = 3.5e-4f;
        System.out.println("numFloat = " + numFloat);
        System.out.println("tipo float corresponde a = " + Float.BYTES + "bytes");
        System.out.println("tipo float puede almacenar en total " + Float.SIZE + " bits");
        System.out.println("valor máximo de un float " + Float.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un float " + Float.MIN_VALUE + " bits");
        System.out.println("---");

        double numDouble = 3.14159265358979323846;
        System.out.println("numDouble = " + numDouble);
        System.out.println("tipo double corresponde a = " + Double.BYTES + "bytes");
        System.out.println("tipo double puede almacenar en total " + Double.SIZE + " bits");
        System.out.println("valor máximo de un double " + Double.MAX_VALUE + " bits");
        System.out.println("valor mínimo de un double " + Double.MIN_VALUE + " bits");
        System.out.println("---");

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
