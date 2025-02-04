package threads;

public class Contador {
    private int valor = 0;

    //public void incrementar() {
    //    valor++;
    //}


    // Sincronização com synchronized
    public synchronized void incrementar() { // Bloqueia o acesso simultâneo
        valor++;
    }

    public int getValor() {
        return valor;
    }


}
