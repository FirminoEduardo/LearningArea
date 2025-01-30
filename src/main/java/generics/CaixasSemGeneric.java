package generics;

//Solução sem generics
//Como usamos Object, qualquer tipo pode ser armazenado. Porém, é necessário cast
//para recuperar os valores

//Ex:
// Caixa caixa = new Caixa();
//caixa.setValor("Hello");
//String texto = (String) caixa.getValor(); // Precisa de cast
//
//caixa.setValor(10);
//int numero = (int) caixa.getValor(); // Erro em tempo de execução se for um tipo errado!
//Pode causar ClassCastException, caso tente converter para o tipo errado.


public class CaixasSemGeneric {
    private Object valor;

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }
}
