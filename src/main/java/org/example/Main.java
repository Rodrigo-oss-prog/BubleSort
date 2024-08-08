/*Uma função para ordenar as notas usando o algoritmo BubbleSort. Esta função deverá
receber como parâmetros o array e um número inteiro indicando se a ordenação será
crescente (1) ou se ela será decrescente (-1)*/

package org.example;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!Buble sort");

        int[] notas = {5, 2, 8, 7, 1, 9};
        int tamanho = notas.length;
        System.out.println(tamanho);

        System.out.println("Notas passadas: ");
        for(int i = 0; i < tamanho; i++){
            System.out.print(notas[i] + " ");
        }
        // loop principal
        for(int i = 0; i < tamanho - 1; i++){
            // cada passo do bubble sort
            for(int j = 0; j < tamanho - i -1; j++){
                if(notas[j] > notas[j+1]){
                    // trocando os elementos de posição
                    int aux = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("Notas ordenadas: ");
        for(int i = 0; i < tamanho; i++) {
            System.out.print(notas[i] + " ");
        }
    }









}
