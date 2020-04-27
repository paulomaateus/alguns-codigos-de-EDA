/*import java.util.Arrays;
import java.util.Scanner;
class main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // recebendo as entradas
        String[] arrayStr = sc.nextLine().split(" ");
        int max = sc.nextInt();
        // transformado as entradas em um array de int
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        algoritmo counting = new algoritmo();
        counting.countingSort(array, max); 
    }
}

class algoritmo{
    public void countingSort(int[]v, int max){
        int[] arrayCumulativo = new int[max + 1];
        for(int i = 0; i < v.length; i++){
            arrayCumulativo[v[i]] += 1;
            System.out.println(imprimirArray(arrayCumulativo));
        }
        
        for(int i = 1; i < arrayCumulativo.length; i++){
            arrayCumulativo[i] += arrayCumulativo[i - 1]; 
        }
        System.out.println("Cumulativa do vetor de contagem - " + imprimirArray(arrayCumulativo));

        int[] arrayRetorno = new int[v.length];

        for(int i = 0; i < v.length; i++){
            arrayRetorno[arrayCumulativo[v[i]] -1] = v[i];
            arrayCumulativo[v[i]] -= 1;  
        }
        System.out.println(imprimirArray(arrayCumulativo));

        System.out.println(imprimirArray(arrayRetorno));
    }
    public String imprimirArray(int[] v){
        String retorno = "";
        boolean espaco = false;

        for(int i = 0; i < v.length; i++){
            if(espaco) {
                retorno += " ";   
            }
            retorno += v[i];
            espaco = true;
        }
        return retorno;
    }
}*/

/**
 * metodo para ordenadar arrays de numeros com valores nao muito altos.
 * Ele usa outros arrays para mapear cada valor do array original por indices em novo array
 * Nesse novo array de 0, cada posicao que representa um numero no array original é somado 1 na posicao.
 */



