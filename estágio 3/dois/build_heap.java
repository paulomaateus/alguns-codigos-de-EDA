package tres.dois;

/** java.util.Arrays;
import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entradas = sc.nextLine().split(" ");
        Heap myHeap = new Heap(entradas.length);
        for(String entrada : entradas){
            myHeap.add(Integer.parseInt(entrada));
        }
        myHeap.buildHeap();
        System.out.println(myHeap.toString());
    }
}


class Heap {
    int[] heap;
    int fim;

    public Heap(int capacidade){
        this.heap = new int[capacidade];
        this.fim = -1;
    }
    public boolean isEmpty(){
        return this.fim == -1;
    }
    public int getLeft(int index){
        int left = -1 ;
        if(!isEmpty()){
            left = (2 * index) + 1;
            if(left > this.fim){
                left = -1;
            }
        }
        return left;
    }
    public int getRight(int index){
        int right = -1;
        if(!isEmpty()){
            right = (2 * index) + 2;
            if(right > this.fim){
                right = -1;
            }
        }
        return right;
    }
    public int parent(int index){
        int parent = -1;
        if(!isEmpty()) {
            if(index <= this.fim){
                parent = (index - 1) / 2;
            }
        }
        return parent;
    }
    public boolean isFull(){
        return this.fim == this.heap.length -1;
    }
    public void add(int value){
        if(!isFull()) {
            this.fim += 1;
            this.heap[this.fim] = value;
        }
    }
    public void buildHeap() {
        for (int i = this.parent(fim); i >= 0; i--){
            heapFy(i);
        }
    }
    private void heapFy(int index){
        if(index >= 0 && index <= this.fim){
            int left = this.getLeft(index);
            int right = this.getRight(index);
            int maior = index;

            if(left != -1 && this.heap[left] > this.heap[maior]){
                maior = left;
            }
            if(right != -1 && this.heap[right] > this.heap[maior]){
                maior = right;
            }
            if(maior != index){
                swap(this.heap, maior, index);
                heapFy(maior);
            }
        }
    }


    @Override
    public String toString(){
        return Arrays.toString(this.heap);
    }
    private void swap(int[] estrutura, int index1, int index2){
        int aux = estrutura[index1];
        estrutura[index1] = estrutura[index2];
        estrutura[index2] = aux;
    }
}
*/