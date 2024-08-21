package variables;

public class Variables {
    public void saludar() {
        /*--- TipoDato nombreVariable = valor; ---*/
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
        System.out.println("mayúsculas -> " + mensaje.toUpperCase());
        int num = 10;

        boolean valor = false;
        if (!valor){
            System.out.println("número -> " + num);
        }
    }
}
