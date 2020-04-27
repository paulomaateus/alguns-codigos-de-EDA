/*import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linkedList fila = new linkedList();
        while(true){
            String entrada = sc.nextLine();
            if(entrada.equals("element")){
                fila.element();
            }else if(entrada.equals("print")){
                fila.print();
            }else if(entrada.equals("remove")){
                fila.remove();
            }else if(entrada.equals("end")){
                sc.close();
                break;
            }else{
                if(entrada.split(" ")[0].equals("search")){
                    fila.search(Integer.parseInt(entrada.split(" ")[1]));
                }else{
                    fila.add(Integer.parseInt(entrada.split(" ")[1]));
                }
            }
        }        
    }
}

class linkedList{
    node head;
    public linkedList(){
        head = null;
    }
    public void add(int v){
        node novoNode = new node();
        novoNode.setValor(v);
        if(isEmpty()){
            this.head = novoNode;
        }else{
            add(this.head,novoNode);
        }
    }
    private void add(node atual, node novoNode){
        if(atual.getProximo() == null){
            atual.setProx(novoNode);
            novoNode.setAnt(atual);
        }else{
            add(atual.getProximo(), novoNode);
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(print(this.head));
        }
    }
    private String print(node node){
        String retorno= "";
        if(node.getProximo() == null){
            return retorno + node.getValor();
        }else{
            return retorno + node.getValor() + " " + print(node.getProximo());
        }
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            this.head = this.head.getProximo();
            if(this.head != null){
                this.head.setAnt(null);
            }
        }
    }
    public boolean isEmpty(){
        return this.head == null;
    }
    public void search(int valor){
        if(isEmpty()){
            System.out.println(-1);
        }else{
            search(this.head, 0, valor);
        }
    }
    public void search(node node, int index, int valor){
        if(node.getProximo() == null && valor != node.getValor()){
            System.out.println(-1);
        }else if(valor == node.getValor()){
            System.out.println(index);
        }else{
            search(node.getProximo(), index + 1, valor);
        }
    }
    public void element(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(this.head.getValor());
        }
    }
}

class node{
    int valor;
    node proximo;
    node anterior;
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public void setProx(node proximo){
        this.proximo = proximo;
    }
    public void setAnt(node anterior){
        this.anterior = anterior;
    }
    public node getProximo(){
        return this.proximo;
    }
    public node getAnterior(){
        return this.anterior;
    }
    public int getValor(){
        return this.valor;
    }
}*/