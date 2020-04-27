/*import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // recebendo as entradas
        String[] arrayStr = sc.nextLine().split(" ");
        // transformado as entradas em um array de int
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        algoritmo quickSort = new algoritmo();
        quickSort.quickSort(array, 0, array.length-1);
    }
}

class algoritmo{
    public void quickSort(int[] v, int ini, int fim){
        if(ini < fim){
            int pivot = particiona(v, ini, fim);

            quickSort(v, ini, pivot -1);
            quickSort(v, pivot + 1, fim);
        }
    }

    public int particiona(int[] v, int ini, int fim){
        int pivot = v[ini];
        int i = ini;
        for(int j = ini + 1; j <= fim; j++ ){
            if(v[j] < pivot){
                i++;
                swap(v, i, j);
            }
        }
        swap(v, ini, i);
        // imprimindo array
        boolean espaco = false;
        String retorno = "";
        for(int k = 0;  k < v.length; k++){
            if(espaco){ 
                retorno += " "; 
            }
            retorno += v[k];
            espaco= true;
        }
        System.out.println(retorno);
        return i;
    }

    public void swap(int[]v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

}*/