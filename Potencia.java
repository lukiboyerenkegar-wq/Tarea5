package Tarea4;

public class Potencia {
    public static long potencia(int base, int n){
        if(n == 0)
            return 1;
            return base* potencia(base, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(potencia(2, 5));
    }
}