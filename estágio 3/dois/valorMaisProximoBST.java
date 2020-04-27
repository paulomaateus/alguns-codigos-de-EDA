package tres.dois;
/**
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class main{
    public static void main(String[] args){
        valorMaisProximoBST Arvore = new valorMaisProximoBST();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        int value = sc.nextInt();
        sc.nextLine();

        System.out.println(Arvore.toString());
        System.out.println(Arvore.searchValorMaisProximo(value));

    }
}
class valorMaisProximoBST {
    Node root;

    public void add(int value){
        if(isEmpty()){
            this.root = new Node(value);
        }else{
            this.root.add(value);
        }
    }

    private boolean isEmpty() {
        return this.root == null;
    }
    public int searchValorMaisProximo(int value){

        int maisProximo = this.root.getValue();
        int menorDistancia = Math.abs(maisProximo - value);
        int esquerdaOuDireta = maisProximo - value;
        Node node = this.root;

        while(node != null){
            if(Math.abs(node.getValue() - value) < menorDistancia){
                menorDistancia = Math.abs(maisProximo - value);
                maisProximo = node.getValue();
                esquerdaOuDireta = maisProximo - value;
            }
            if(esquerdaOuDireta < 0){
                node = node.getRight();
            }else{
                node = node.getLeft();
            }
        }
        return maisProximo;
    }
    private void preOrdem(ArrayList lista, Node node){
        if(node != null){
            lista.add(node.getValue());
            preOrdem(lista, node.getLeft());
            preOrdem(lista, node.getRight());
        }
    }
    @Override
    public String toString(){
        ArrayList listaPreOrdem = new ArrayList();
        preOrdem(listaPreOrdem, this.root);
        Integer[] arrayPreOrdem = (Integer[]) listaPreOrdem.toArray(new Integer[listaPreOrdem.size()]);
        return Arrays.toString(arrayPreOrdem);
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
 */
