import java.util.Scanner;

class main {
    public static void main(String[] args){
        algoritmo buscador = new algoritmo();
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" "); 
        Integer[] array = new Integer[entrada.length];
        for(int i = 0; i < entrada.length ; i++){
            array[i] = Integer.parseInt(entrada[i]);
        }
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println(buscador.ceil(array, 0, array.length -1, num));
        System.out.println(buscador.floor(array, 0, array.length -1 , num));
    }
}

class algoritmo{
    public int ceil(Integer[] array, int ini, int fim, int valor){
        int meio = (ini + fim)/2;
        if(ini == meio){
            if(array[fim] < valor)return -1;
            else if(array[ini] < valor)return fim;
            else return ini;
            
        }else{
            if(valor == array[meio])return meio;
            else if(valor > array[meio])return this.ceil(array, meio + 1, fim, valor);
            else return this.ceil(array, ini, meio, valor);
        }
    }

    public int floor(Integer[] array, int ini, int fim, int valor){
        int meio = (ini + fim)/2;
        if(ini == meio){
            if(valor < array[ini])return -1;
            else if(valor < array[fim])return ini;
            else return fim;
        }else {
            
            if(valor == array[meio])return meio;
            else if(valor > array[meio]) return floor(array, meio + 1, fim, valor);
            else return floor(array, ini, meio, valor);
        }
    }
/**
 * algoritmo de teto e piso.
 * Dado um numero x, esse algoritmo procura em um array ORDENADO o teto ou o piso desse numero.
 * O teto de um numero e ele mesmo ou o menor numero maior que ele.
 * O piso de um numero e ele mesmo ou o maior numero menor que ele.
 */
}