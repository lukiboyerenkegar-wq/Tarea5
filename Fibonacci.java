package Tarea4;

public class Fibonacci {
    public static long suma(int n){
        if(n == 0|| n == 1){
            return  1;
        }
        return suma(n - 1) + suma(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(suma(7));
    }
}