package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Streams a partir de uma lista (coleção)
        List<String> nomes = List.of("Ana", "Bob", "Charlie");

        nomes.stream().forEach(System.out::println); // Imprime cada nome

        // Streams a partir de um array
        String[] frutas = {"Maça", "Banana", "Melancia"};

        Arrays.stream(frutas).forEach(System.out::println);


        //Gerando um stream manualmente
        Stream<Integer> numeros = Stream.of(1, 2, 3);
        numeros.forEach(System.out::println);

        // filter(Predicate) -> Filtra elementos com base em uma condição
        // map(Function) -> Transformar os elementos de um Stream
        // sorted(Comparator) -> Ordena os elementos
        // distinct -> Remove os elementos duplicados
        // limit(n) -> Mantém apenas os primeiros N elementos

        List<String> nomes2 = List.of("Maria", "José", "Antonio");

        nomes2.stream()
                .filter(nome -> nome.startsWith("A"))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // Operações terminais
        // forEach(Consumer) -> Executa uma ação para cada elemento
        // collect(Collector) -> Transforma um stream em uma coleção ou String
        // count() -> Conta os elementos do Stream
        // findFirst() -> Retorna o primeiro elemento, SE EXISTIR
        // allMatch(Predicate) -> Retorna true se todos os elementos atenderem a condição

        
    }
}
