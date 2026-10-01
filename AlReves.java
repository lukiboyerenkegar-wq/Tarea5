package Tarea5;

public class AlReves {
    public static void reves(String palabra, int posicion){
        if(posicion >= 0){
            System.out.println(palabra.charAt(posicion));
            reves(palabra, posicion - 1);
        }
    }
    public static void main(String[] args) {
        String palabra = "Hola";
        reves(palabra,palabra.length() - 1);
    }
}