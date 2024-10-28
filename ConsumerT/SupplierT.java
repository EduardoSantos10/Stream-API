package ConsumerT;

// Representa uma operação que não aceita nenhum argumento e retorne um resultado de tipo T.
// é comumente usado para crar ou fornecer novos objetos de um determinado tipo.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierT {
    public static void main(String[] args){
        // usar o supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> suadacao = () -> "Olá, seja bem-vindo(a)";

        // usar o supplier para obter uma lista com 5 suadações
        List<String> listaSaudacoes = Stream.generate(suadacao).limit(10).collect(Collectors.toList());

        // imprimir as saudações geradas

        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
