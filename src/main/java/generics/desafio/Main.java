package generics.desafio;

import java.util.Scanner;

public class Main extends Repositorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();
        int opcao = 1;


        while (opcao != 4) {
            UserInterface.ExibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    Produto produto = new Produto(nomeProduto);
                    repositorio.adicionar(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProdutoRemovido = scanner.next();
                    Produto produtoRemovido = new Produto(nomeProdutoRemovido);
                    repositorio.remover(produtoRemovido);
                    System.out.println("Produto removido com sucesso!");
                    break;
                case 3:
                    System.out.println(repositorio.getLista().toString());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
