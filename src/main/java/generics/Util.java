package generics;

//Generics em métodos

public class Util{
    public static <T> void imprimir(T elemento) {
        System.out.println("Elemento: " + elemento);
    }
}
