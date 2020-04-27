/*import java.util.Scanner;

class main{
    public static void main(String[] args){
        buscaBinaria buscador = new buscaBinaria();
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" "); 
        Integer[] array = new Integer[entrada.length];
        for(int i = 0; i < entrada.length ; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println(buscador.buscar(array, 0, array.length -1 , num));
    }
}

class buscaBinaria{
    public int buscar(Integer[] array, int ini, int fim,  int valor){
        if(ini == fim && array[ini] == valor)return fim;
        else if(ini == fim && array[ini] != valor)return -1;
        else{
            int meio = (ini + fim)/2;
            if(array[meio] == valor)return meio;
            else if(array[meio] < valor)return buscar(array, meio + 1, fim, valor);
            else return buscar(array, ini, meio -1, valor);
        }
    }
}*/

/**
 * algoritmo de busca binaria para otimizar buscas em arrays ordenados.
 * esse algoritmo é da forma dividir e conquistar. ele divide o array ao meio e chama o metodo da busca novamente para
 * a metade onde supostamente possa estar localizado o valor procurado
 */