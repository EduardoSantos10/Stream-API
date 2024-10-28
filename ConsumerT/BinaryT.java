package ConsumerT;

// Representa uam operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
// é usada para realizar operações de redução e pares de elementos, como somar numeros ou combinar objetos

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryT {

    public static void main(String[] args){
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar o BianryOperator com expressões lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream().reduce(0, somar);

        //imprimir o resultado da soma
        System.out.println(" A soma dos núemros é: " + resultado);
    }
}
