package generics;

public class Main {
    public static void main(String[] args) {
        CaixasComGenerics<String> caixaTexto = new CaixasComGenerics<>();
        caixaTexto.setValor("Hello");
        String texto = caixaTexto.getValor(); //Não precisa de cast

        CaixasComGenerics<Integer> caixaNumero = new CaixasComGenerics<>();
        caixaNumero.setValor(10);
        int numero = caixaNumero.getValor(); // Não precisa de cast

        Util.imprimir("Olá");
        Util.imprimir(25);
        Util.imprimir(3.14);
        Util.imprimir(numero);

        Par<String, Integer> par = new Par<>("Idade", 25);
        Util.imprimir(par.getChave() + ": " + par.getValor());
    }
}
