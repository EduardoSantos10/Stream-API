package ConsumerT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Representa umafunção que aceita um argumento de tipo T e retorna um resultado de tipo R.
// é utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipo.

public class FunctionTr {
    public static void main(String[] args){
        // criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar a function com expressões lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numeroDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());

        // imprimir a lista de numeros dobrados
        numeroDobrados.forEach(n -> System.out.println(n));
    }
}
