package ConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
// é comumente usado para filtrar os elementos so stream com base em alguma condição

public class PredicateT {

    public static void main(String[] args){
        // criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby", "assembly");

        // criar um predicate que verificar se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // usar o stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou ni filtro

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
}
