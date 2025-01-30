package generics;

public class CaixasComGenerics<T>{
    private T valor;

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
}
