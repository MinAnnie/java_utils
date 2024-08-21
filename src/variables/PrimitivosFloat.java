package variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
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
    }
}
