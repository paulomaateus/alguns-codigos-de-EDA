package tres.dois;

/**import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entradas = sc.nextLine().split(" ");
        is_heap myHeap = new is_heap(entradas.length);
        for(String entrada : entradas){
            myHeap.add(Integer.parseInt(entrada));
        }
        System.out.println(myHeap.isHeap());

    }
}
class is_heap{

    int[] heap;
    int fim;

    public is_heap(int capacidade){
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
    public boolean isHeap(){
        boolean is_heap = true;
        for(int i = 0; i <= this.parent(this.fim); i++){
            int right = this.getRight(i);
            int left = this.getLeft(i);
            if(right != -1 && this.heap[right] > this.heap[i] || left != -1 && this.heap[left] > this.heap[i]){
                is_heap = false;
            }
        }
        return is_heap;
    }
}*/



