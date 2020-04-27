/**import java.util.Scanner;

class main{
    public static void main(String[] args){
        alturaBST Arvore = new alturaBST();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        System.out.println(Arvore.alturaDaBst());
    }
}
class alturaBST {
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
    public int alturaDaBst(){
        if(!isEmpty()){
            return alturaDaBst(this.root) - 1 ;
        }else{
            return -1;
        }
    }

    private int alturaDaBst(Node node) {
        int altura1;
        int altura2;
        if(node.getLeft() != null){
            altura1 = alturaDaBst(node.getLeft());
        }else{
            altura1 = 0;
        }if(node.getRight() != null){
            altura2 = alturaDaBst(node.getRight());
        }else{
            altura2 = 0;
        }
        return  1 + Integer.max(altura1, altura2);
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
}*/


