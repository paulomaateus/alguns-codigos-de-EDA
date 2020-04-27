/*import java.util.Arrays;
import java.util.Scanner;
/**
 * Algoritmo explicado. 
 * Tenho que percorrer o array do seu inicio ao fim, olhando pra esquerda de cada numero. Se o numero a esquerda (posicao(i - 1)) do numero que estou olhando ((posicao(i)) = atual)
 * for maior que o numero atual, eu trago ele para a dereita do atual.  
 * Basicamente é: a cada iteracao trazer todos numeros a esquerda do meu numero que sao maiores que ele para a sua direta. 
 */
/*class algoritmo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // recebendo as entradas
        String[] arrayStr = sc.nextLine().split(" ");
        // transformado as entradas em um array de int
        Integer[] array = new Integer[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        
        int atual, j;
        for(int i = 1; i < array.length; i++) {
            atual = array[i];
            j = i;
            while(j > 0 && array[j-1] > atual){
                array[j] = array[j-1];
                j -= 1;
            }
            array[j] = atual;
            System.out.println(Arrays.toString(array));
        }
    }
}*/

/**
 * Olho pra array[x] e vejo se array[x-1] > x
 * se for eu troco os dois e subtraio x - 1
 * Faco a mesa coisa ate que x seja igual a 1 ou entao array[x-1] < x
 * A cada iteracao eu trago o numero para seu lugar  
 */