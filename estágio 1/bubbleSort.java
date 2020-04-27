/*import java.util.Scanner;

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
        //bubble passo a passo
        boolean imprimiu = false;
        // Este algoritmo funciona com 2 for identados. O for mais externo tem a função de garantir com que 
        // passemos em todas as posições do array com o outro for.
        for(int i = 0; i < array.length; i++){
            boolean trocou = false;
            for(int j = 0; j < array.length - i -1; j ++ ){ // nesse outro for nós só precisamos ir ate o fim do array - 1
                // pois nos temos que observer a posição seguinte sempre, e isso daria erro caso o for iterasse ate a ultima posicao
                // Quando o for externo faz 1 iteracao, temos a certeza de que o maior numero do array esta no fim do array
                // logo, nao precisamos mais percorrer o array inteiro nas iterações seguintes do for interno.
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    trocou = true;
                }
            }
            // imprimir apenas quando ocorre a troca de numeros internamente no array
            if(trocou) {
                String saida = "";
                boolean espaco = false;
                for(int h : array){
                    if(espaco) saida += " ";
                    saida += h;
                    espaco = true;
                }   
                System.out.println(saida);
                trocou = false;
                imprimiu = true;
            }
        }
        if(!imprimiu){
            String saida = "";
            boolean espaco = false;
            for(int h : array){
                if(espaco) saida += " ";
                saida += h;
                espaco = true;
            }   
            System.out.println(saida);
        }
    }
}

/**
 * No pior caso e no melhor caso esse algoritmo é de ordem quadratica
 */
