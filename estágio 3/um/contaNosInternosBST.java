/**import java.util.Scanner;

class main{
    public static void main(String[] args){
        contaNosInternos Arvore = new contaNosInternos();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        System.out.println(Arvore.contaNosComFilhos());

    }
}
class contaNosInternos {
    Node root;
    int nosInternos;

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
    public int contaNosComFilhos(){
        contaNosComFilhos(this.root);
        return this.nosInternos;
    }
    public void contaNosComFilhos(Node node){
        if(ehNodeInterno(node)){
            this.nosInternos += 1;
        }
        if(node.getRight() != null){
            contaNosComFilhos(node.getRight());
        }
        if(node.getLeft()!= null ){
            contaNosComFilhos(node.getLeft());
        }
    }
    private boolean ehNodeInterno(Node node){
        return node.getRight() != null || node.getLeft() != null;
    }
}
class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(int value) {
        this.left = new Node(value);
    }

    public void setRight(int value) {
        this.right = new Node(value);
    }

    public Node getRight() {
        return this.right;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (value > this.value) {
            if (this.right != null) {
                this.right.add(value);
            } else {
                this.setRight(value);
            }
        } else {
            if (this.left != null) {
                this.left.add(value);
            } else {
                this.setLeft(value);
            }
        }
    }
}*/
