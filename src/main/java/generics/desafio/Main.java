package generics.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repositorio<Produto> repositorio = new Repositorio<>(); // ✅ Especificando tipo Generics corretamente
        int opcao = 1;

        while (opcao != 4) {
            UserInterface.ExibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // ✅ Consome a quebra de linha após nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine(); // ✅ Usa nextLine() para pegar nomes completos
                    Produto produto = new Produto(nomeProduto);
                    repositorio.adicionar(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    String nomeProdutoRemovido = scanner.nextLine(); // ✅ Usa nextLine()
                    Produto produtoRemovido = new Produto(nomeProdutoRemovido);
                    repositorio.remover(produtoRemovido);
                    System.out.println("Produto removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Lista de produtos:");
                    System.out.println(repositorio.getLista());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}