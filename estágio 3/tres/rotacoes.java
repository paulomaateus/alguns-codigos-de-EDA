package tres.tres;
/**
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        rotacoes bst = new rotacoes();
        String[] entrada = sc.nextLine().split(" ");
        for(int i = 0; i < entrada.length; i++){
            bst.add(Integer.parseInt(entrada[i]));
        }
        System.out.print(bst.balanceada());

    }
}
class rotacoes {
    private Node root;
    boolean balanceou = false;

    public void add(int value){
        Node novoNode = new Node(value);
        if(this.root == null){
            this.root = novoNode;
        }else{
            this.root.add(novoNode);
        }
        Balancear(novoNode);
    }

    private void Balancear(Node node) {
        if(node != null) {
            int balance = altura(node.getLeft()) - altura(node.getRight());
            if (balance >= -1 && balance <= 1) {
                node.setBalance(balance);
                Balancear(node.getParent());
            } else {
                this.balanceou = true;
                if (node.getBalance() > 0) {
                    if (node.getLeft().getBalance() < 0) {
                        zigzagEsqDir(node);

                    } else {
                        rotacaoDir(node);
                    }
                } else {
                    if (node.getRight().getBalance() < 0) {
                        rotacaoEsq(node);
                    } else {
                        zigzagDirEsq(node);
                    }
                }
            }
            Balancear(node.getParent());
        }
    }

    public String balanceada(){
        if(!balanceou){
            return "balanceada\n";
        }else{
            return"";
        }
    }

    private void zigzagDirEsq(Node node) {
        Node nodeMeio = node.getRight();
        rotacaoDir(nodeMeio);
        rotacaoEsq(node);
    }

    private void zigzagEsqDir(Node node) {
        Node nodeMeio = node.getLeft();
        rotacaoEsq(nodeMeio);
        rotacaoDir(node);
    }

    private void rotacaoDir(Node node) {
        System.out.println("rot_dir("+ node.getValue()+ ")");
        Node nodeMeio = node.getLeft();
        node.setLeft(nodeMeio.getRight());
        nodeMeio.setRight(node);
        nodeMeio.setParent(node.getParent());
        if(node.getParent() != null){
            node.getParent().setRight(nodeMeio);
        }
        node.setParent(nodeMeio);
        if(node.getValue() == this.root.getValue()){
            this.root = nodeMeio;
        }
        System.out.println(this.toString());
    }

    private void rotacaoEsq(Node node) {
        System.out.println("rot_esq("+ node.getValue()+ ")");
        Node nodeMeio = node.getRight();
        node.setRight(nodeMeio.getLeft());
        nodeMeio.setLeft(node);
        nodeMeio.setParent(node.getParent());
        if(node.getParent() != null){
            node.getParent().setLeft(nodeMeio);
        }
        node.setParent(nodeMeio);
        if(node.getValue() == this.root.getValue()){
            this.root = nodeMeio;
        }
        System.out.println(this.toString());
    }


    public int altura(Node node){
        if(node == null){
            return -1;
        }else{
            return 1 + Integer.max(altura(node.getLeft()), altura(node.getRight()));
        }
    }
    public void preOrdem(ArrayList lista, Node node){
        if(node != null){
            lista.add(node.getValue());
            preOrdem(lista, node.getLeft());
            preOrdem(lista, node.getRight());
        }
    }
    @Override
    public String toString(){
        ArrayList lista = new ArrayList();
        preOrdem(lista, this.root);
        return Arrays.toString(lista.toArray());
    }
}
class Node{
    Node left;
    Node Right;
    Node parent;
    int value;
    int balance;

    public Node(int value){
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return Right;
    }

    public Node getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }

    public void add(Node node){
        if(node.getValue() > this.getValue()){
            if(this.getRight() == null){
                this.setRight(node);
                this.getRight().setParent(this);
            }else{
                this.getRight().add(node);
            }
        }else{
            if(this.getLeft() == null){
                this.setLeft(node);
                this.getLeft().setParent(this);
            }else{
                this.getLeft().add(node);

            }
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void setValue(int value){
        this.value = value;
    }
}
*/