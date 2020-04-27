package tres.dois;
/**
import java.util.*;

class main{
    public static void main(String[] args){
        BFSDireita Arvore = new BFSDireita();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        Arvore.setSize(valoresArvore.split(" ").length);
        System.out.println(Arvore.toString());


    }
}
class BFSDireita {
    Node root;
    int size;

    public void add(int value){
        if(isEmpty()){
            this.root = new Node(value);
        }else{
            this.root.add(value);

        }
    }
    public void setSize(int size){
        this.size = size;
    }

    private boolean isEmpty() {
        return this.root == null;
    }
    private Integer[] bfsDireita(){
        queue fila = new queue(this.size);
        ArrayList listaBFSDireita = new ArrayList();
        fila.add(this.root);

        Node elem;
        while (!fila.isEmpty()){
            elem = (Node)fila.remove();
            listaBFSDireita.add(elem.getValue());

            if(elem.getRight() != null) {
                fila.add(elem.getRight());
            }
            if(elem.getLeft() != null) {
                fila.add(elem.getLeft());
            }
        }
        return (Integer[]) listaBFSDireita.toArray(new Integer[listaBFSDireita.size()]);

    }
    @Override
    public String toString(){
        return Arrays.toString(bfsDireita());
    }

}
class Node{
    private int value;
    private Node right;
    private Node left;

    public Node(int value){
        this.value = value;
    }
    public void setLeft(int value){
        this.left = new Node(value);
    }
    public void setRight(int value){
        this.right = new Node(value);
    }
    public Node getRight(){
        return this.right;
    }
    public Node getLeft(){
        return this.left;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void add(int value){
        if(value > this.value){
            if(this.right != null){
                this.right.add(value);
            }else{
                this.setRight(value);
            }
        }else{
            if(this.left != null){
                this.left.add(value);
            }else{
                this.setLeft(value);
            }
        }
    }
}
class queue {

    int tail;
    int capacidade;
    Object[] array;

    public queue(int capacidade){
        this.array = new Object[capacidade];
        this.capacidade = capacidade;
        this.tail = -1;
    }
    public boolean isEmpty(){
        return this.tail == -1;
    }
    public boolean isFull(){
        return this.tail == capacidade -1;
    }

    public void add(Object valor){
        if(isFull()){
            throw new RuntimeException();
        }else{
            this.array[tail + 1] = valor;
            this.tail += 1;
        }
    }
    public Object remove(){
        if(isEmpty()){
            throw new RuntimeException();
        }else{
            Object aux = this.array[0];
            this.shiftLeft();
            this.tail -= 1;
            return aux;
        }
    }
    private void shiftLeft() {
        for(int i = 0; i < this.tail; i++){
            this.array[i] = this.array[i +1];
        }
    }
    public int size(){
        return this.tail + 1;
    }
}
*/
