package variables;

public class SistemasNumericos {
    public static void main(String[] args) {
        int decimal = 500;
        System.out.println("decimal = " + decimal);

        System.out.println("binario de " + decimal + " = " + Integer.toBinaryString(decimal));
        
        int numBinario = 0b111110100;
        System.out.println("numBinario = " + numBinario);

        System.out.println("octal de " + decimal + " = " + Integer.toOctalString(decimal));
        
        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal);

        System.out.println("hexadecimal de " + decimal + " = " + Integer.toHexString(decimal));
        
        int numHexa = 0x1f4;
        System.out.println("numHexa = " + numHexa);
    }
}
