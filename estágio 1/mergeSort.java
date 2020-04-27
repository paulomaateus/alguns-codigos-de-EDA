/*import java.util.Arrays;
import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // recebendo as entradas
        String[] arrayStr = sc.nextLine().split(" ");
        // transformado as entradas em um array de int
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++){
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        algoritmo mergeSort = new algoritmo();
        mergeSort.dividir(0, array.length -1 , array);
        System.out.println(Arrays.toString(array));

    

    }
}
class algoritmo{
    public void dividir(int ini, int fim, int[] array){
        //construindo array temporario para imprimir 
        int[] temp = new int[fim - ini + 1];
        int k = ini;
        for(int i = 0; i < temp.length; i++){
            temp[i] = array[k];
            k += 1;
        }
        System.out.println(Arrays.toString(temp));

        if(ini < fim){
            int meio = (ini + fim) / 2;

            dividir(ini, meio, array);
            dividir(meio+1, fim, array);

            conquistar(ini, meio, fim, array);
        }
    }
    public void conquistar(int ini, int meio, int fim, int[] array){
        int[] aux = new int[array.length];
        for(int i = ini; i <= fim; i++){
            aux[i] = array[i];
        }

        int apontadorInicio = ini;
        int apontadorMeio = meio + 1;
        int apontadorArray = ini;

        while(apontadorInicio <= meio && apontadorMeio <= fim){
            if(aux[apontadorInicio] < aux[apontadorMeio]){
                array[apontadorArray] = aux[apontadorInicio];
                apontadorInicio += 1;
            }else {
                array[apontadorArray] = array[apontadorMeio];
                apontadorMeio += 1;
            }
            apontadorArray += 1;
        }


        while(apontadorInicio <= meio){
            array[apontadorArray] = aux[apontadorInicio];
            apontadorArray += 1;
            apontadorInicio += 1;
        }

        while(apontadorMeio <= fim){
            array[apontadorArray] = aux[apontadorMeio];
            apontadorArray += 1;
            apontadorMeio += 1;
        }

        if(ini != 0 || fim != array.length -1){
            int[] temp = new int[fim - ini + 1];
            int k = ini;
            for(int i = 0; i < temp.length; i++){
                temp[i] = array[k];
                k += 1;
            }
            System.out.println(Arrays.toString(temp));
        }
    }
}*/