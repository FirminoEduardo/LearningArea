package threads;

public class Main {
    public static void main(String[] args) {
        // MinhaThread thread1 = new MinhaThread();

        // thread1.start(); // Inicia a execução da Thread

        // Thread thread2 = new Thread(new MinhaRunnable());
        // thread2.start(); // Inicia a execução da Thread

        // thread.run();  // Executa no mesmo fluxo principal, sem paralelismo.
        // thread.start();  // Cria uma nova thread e executa paralelamente.


        // Sincronização de Threads
        Contador contador = new Contador();

        Runnable tarefa = () -> {
            for (int i = 0; i < 10; i++) {
                contador.incrementar();
            }
        };

        Thread thread1 = new Thread(tarefa);
        Thread thread2 = new Thread(tarefa);

        thread1.start();
        thread2.start();

        // Pode exibir um valor inconsistente, pois as threads estão sincronizadas
        System.out.println("Valor final: " + contador.getValor());
    }
}
