package Tarea4;

public class Suma {
    public static long suma(int n){
        if(n == 0|| n == 1){
            return  1;
        }
        return n+ suma(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(suma(5));
    }
}