/**import java.util.Scanner;

class main{
    public static void main(String[] args){
        searchBST Arvore = new searchBST();
        Scanner sc = new Scanner(System.in);
        String valoresArvore = sc.nextLine();
        for(String i : valoresArvore.split(" ")) {
            Arvore.add(Integer.parseInt(i));
        }
        int valor = sc.nextInt();
        sc.nextLine();
        System.out.println(Arvore.search(valor));
    }
}

class searchBST {
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
    public String search(int valor){
        Node aux = this.root;
        String retorno = "";
        boolean encontrou = false;
        boolean ehPrimeiro = true;
        while(!encontrou && aux != null) {
            if(aux.getValue() == valor){
                if(ehPrimeiro){
                    retorno += "["+ valor +"]";
                }else{
                    retorno += ", " + valor + "]";
                }
                encontrou = true;
                ehPrimeiro = false;
            }else if(valor > aux.getValue()){
                if(ehPrimeiro){
                    retorno += "[" + aux.getValue() ;
                }else{
                    retorno += ", " + aux.getValue();
                }
                aux = aux.getRight();
                ehPrimeiro = false;
            }else{
                if(ehPrimeiro){
                    retorno += "[" + aux.getValue();
                }else{
                    retorno += ", " + aux.getValue();
                }
                aux = aux.getLeft();
                ehPrimeiro = false;
            }
        }
        if(!encontrou){
            retorno += "]";
        }
        return retorno;
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
}*/

