package variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
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
    }
}
