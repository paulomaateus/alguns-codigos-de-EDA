/**import java.util.Scanner;

class main{
    public static void main(String[] args){
        predecessorBST Arvore = new predecessorBST();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        int value = sc.nextInt();
        sc.nextLine();

        System.out.println(Arvore.predecessor(value));

    }
}
class predecessorBST {
    Node root;

    public void add(int value) {
        if (isEmpty()) {
            this.root = new Node(value);
        } else {
            this.root.add(value);
        }
    }
    private boolean isEmpty() {
        return this.root == null;
    }

    public String predecessor(int value){
        Node node = search(value);
        String retorno = "";
        if(node.getLeft() != null){
            retorno = "[" + value +", " + max(node.getLeft()) + "]";
        }else{
            retorno = "["+ value + ", " + encontraMenorParente(node.getParent(), value) + "]";
        }
        return retorno;
    }
    private String encontraMenorParente(Node node, int value){
        String retorno = "";
        boolean ehPrimeiro = true;
        while(node != null && node.getValue() > value){
            if(ehPrimeiro){
                retorno += node.getValue();
                ehPrimeiro = false;
            }else{
                retorno += ", " + node.getValue();
            }
            node = node.getParent();
        }
        if(node != null){
            if(ehPrimeiro){
                retorno += node.getValue();
                ehPrimeiro = false;
            }else{
                retorno += ", " + node.getValue();
            }
        }
        return retorno;
    }
    private String max(Node node){
        String retorno = "";
        boolean ehPrimeiro = true;
        while(node != null){
            if(ehPrimeiro){
                retorno += node.getValue();
                ehPrimeiro = false;
            }else{
                retorno += ", " + node.getValue();
            }
            node = node.getRight();
        }
        return retorno;
    }
    private Node search(int value) {
        Node aux = this.root;
        while(aux != null && aux.getValue() != value){
            if(value > aux.getValue()){
                aux = aux.getRight();
            }else{
                aux = aux.getLeft();
            }
        }
        if (aux == null) {
            throw new RuntimeException();
        }else{
            return aux;
        }
    }


}
class Node {
    private int value;
    private Node right;
    private Node left;
    private Node parent;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(int value) {
        this.left = new Node(value);
    }

    public void setRight(int value) {
        this.right = new Node(value);
    }

    public int getValue(){
        return  this.value;
    }
    public Node getRight() {
        return this.right;
    }

    public Node getLeft() {
        return this.left;
    }
    public Node max(){
        if(this.right != null){
            return this.right.max();
        }
        return this;
    }
    public Node min(){
        if(this.left != null){
            return this.left.min();
        }
        return this;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public Node getParent(){
        return this.parent;
    }
    public void setParent(Node parent){
        this.parent = parent;
    }

    public void add(int value) {
        if (value > this.value) {
            if (this.right != null) {
                this.right.add(value);
            } else {
                this.setRight(value);
                this.right.setParent(this);
            }
        } else {
            if (this.left != null) {
                this.left.add(value);
            } else {
                this.setLeft(value);
                this.left.setParent(this);
            }
        }
    }
}
*/

