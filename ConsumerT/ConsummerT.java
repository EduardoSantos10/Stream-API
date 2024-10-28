package ConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
// é utilizada principalmente para realizar ações, ou efeitos colateriais nos elementos do Stream sem modificar, ou retornar valor.

public class ConsummerT {
    public static void main(String[] args){
        // criar lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // usar o consumer com expressões lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // usar o consumer para imprimir números pares no stream
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
