package tres.dois;
/**
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class main{
    public static void main(String[] args){
        elementosMaioresBST Arvore = new elementosMaioresBST();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        int value = sc.nextInt();
        sc.nextLine();
        sc.close();

        System.out.println(Arvore.toString());
        System.out.println(Arvore.contaMaiores(value));

    }
}
class elementosMaioresBST {
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
    public int contaMaiores(int value){
        int maiores = 0;
        Node aux = this.root;
        while(aux != null){
            if(aux.getValue() < value){
                aux = aux.getRight();
            }else if(aux.getValue() == value){
                maiores = size(aux.getRight());
                break;
            }else{
                maiores = size(aux.getRight());
                aux = aux.getLeft();
            }
        }
        return maiores;
    }
    public int size(Node node){
        ArrayList lista = new ArrayList();
        preOrdem(lista, node);
        return lista.size();
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

    public int getValue() {
        return this.value;
    }
}

*/