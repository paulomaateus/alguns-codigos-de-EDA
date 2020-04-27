/*import java.util.Arrays;
import java.util.Scanner;
/**
 * Nesse algoritmo, precisamos fazer com que o menor valor do array fique na primeira posicao, depois o segundo menor fique na segunda posicao
 * e assim sucessivamente ate que ele esteja totalmente ordenado.
 * para simplificar, usamos 2 for. O externo para dizer a posição que iremos colocar o menor e outro para procurar o menor no array. 
 * O segundo for sempre vai começar iterando 1 posicao a frente do for externo, logo, o for externo nao pode percorrer ate a ultima posicao do array
 * e sim ate sua penultima
 */
/*
class algoritmo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // recebendo as entradas
        String[] arrayStr = sc.nextLine().split(" ");
        // transformado as entradas em um array de int
        Integer[] array = new Integer[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        int menorIndice, i, j;

        for( i = 0; i < array.length - 1; i++){
            menorIndice = i;
            for(j = i + 1; j < array.length; j++){
                if(array[j] < array[menorIndice]){
                    menorIndice = j;
                }
            }
            if(menorIndice != i){
                int aux = array[i];
                array[i] = array[menorIndice];
                array[menorIndice] = aux;
            }
            System.out.println(Arrays.toString(array));

        }

    }
}*/