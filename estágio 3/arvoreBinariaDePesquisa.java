/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arvore estrutura = new arvore();
        String entrada;
        while(true){
            entrada = sc.nextLine();
            if(entrada.equals("end")){
                break;
            }else if(entrada.equals("pre ordem")){
                System.out.println(estrutura.preOrdem());
            }else if(entrada.equals("pos ordem")){
                System.out.println(estrutura.posOrdem());
            }else if(entrada.equals("em ordem")){
                System.out.println(estrutura.emOrdem());
            }else if(entrada.equals("size")){
                System.out.println(estrutura.size());
            }else if(entrada.equals("altura")){
                System.out.println(estrutura.altura());
            }else if(entrada.equals("bfs")){
                System.out.println(estrutura.bfs());
            }else if(entrada.split(" ")[0].equals("add")){
                estrutura.add(Integer.parseInt(entrada.split(" ")[1]));
            }else{
                System.out.println(estrutura.remove(Integer.parseInt(entrada.split(" ")[1])));
            }
        }
    }
}

class arvore{
    private Node root;

    public boolean isEmpty(){
        return this.root == null;
    }
    public void add(int valor){
        Node node = new Node(valor);
        if(isEmpty()){
            this.root = node;
        }else{
            add(this.root ,node);
        }
    }
    private void add(Node atual, Node inserido){
        if(inserido.getValor() > atual.getValor()){
            if(atual.getDireita() == null){
                inserido.setAnterior(atual);
                atual.setDireita(inserido);
            }else{
                add(atual.getDireita(), inserido);
            }
        }else{
            if(atual.getEsquerda() == null){
                inserido.setAnterior(atual);
                atual.setEsquerda(inserido);
            }else{
                add(atual.getEsquerda(), inserido);
            }
        }
    }
    public String preOrdem(){
        if(isEmpty()){
            return "vazia";
        }else{
            ArrayList<Integer> array = new ArrayList<>();
            preOrdem(this.root, array);
            return Arrays.toString(array.toArray());
        }
    }
    public String emOrdem(){
        if(isEmpty()){
            return "vazia";
        }else{
            ArrayList<Integer> array = new ArrayList<>();
            emOrdem(this.root, array);
            return Arrays.toString(array.toArray());
        }
    }
    public String posOrdem(){
        if(isEmpty()){
            return "vazia";
        }else{
            ArrayList<Integer> array = new ArrayList<>();
            posOrdem(this.root, array);
            return Arrays.toString(array.toArray());
        }
    }
    private void preOrdem(Node node, ArrayList<Integer> array){
        array.add(node.getValor());
        if(node.getEsquerda() != null) {preOrdem(node.getEsquerda(), array);}
        if(node.getDireita() != null)  {preOrdem(node.getDireita(), array);}
    }
    private void emOrdem(Node node, ArrayList<Integer> array){
        if(node.getEsquerda() != null) {emOrdem(node.getEsquerda(), array);}
        array.add(node.getValor());
        if(node.getDireita() != null) { emOrdem(node.getDireita(), array);}
    }
    private void posOrdem(Node node, ArrayList <Integer>array){
        if(node.getEsquerda() != null) {posOrdem(node.getEsquerda(), array);}
        if(node.getDireita() != null)  {posOrdem(node.getDireita(), array);}
        array.add(node.getValor());
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }else {
            return size(this.root);
        }
    }
    private int size(Node node){
        int retorno = 1;
        if(node.getEsquerda() != null){retorno += size(node.getEsquerda());}
        if(node.getDireita() != null) {retorno += size(node.getDireita());}
    
        return retorno;
    }

    public int altura(){
        if(isEmpty()){
            return -1;
        }else{
            return altura(this.root);
        }
    }

    private int altura(Node node){
        int alturaEsquerda = -1;
        int alturaDireita = -1;
        if(node.getDireita() != null){alturaDireita = altura(node.getDireita());}
        if(node.getEsquerda()!= null){alturaEsquerda = altura(node.getEsquerda());}
        return 1 + Integer.max(alturaDireita, alturaEsquerda);
    }


    public Node search(int valor){
        if(isEmpty()){
            return null;
        }else{
            return search(this.root, valor);
        }
    }

    private Node search(Node node, int valor){
        Node retorno;
        if(valor > node.getValor() && node.getDireita() != null){retorno = search(node.getDireita(), valor);}
        else if( valor < node.getValor() && node.getEsquerda() != null){retorno = search(node.getEsquerda(),valor);}
        else retorno = node;

        return retorno;
    }
    public Node remove(int valor){
        
        Node retorno = null;
        Node remover = search(valor);
        if(!isEmpty() && remover != null){
            retorno = remove(remover);
        }
       
        return retorno;
    }
    private Node remove(Node remover){    
        Node retorno = remover;
        if(remover.ehFolha()){
            if(remover.getAnterior() == null){
                this.root = null;
            }else{
                if(remover.getAnterior().filhoEsquerda(remover)){
                    remover.getAnterior().setEsquerda(null);
                }else{
                    remover.getAnterior().setDireita(null);;
                }
            }
        }else if(remover.umFilho()){
            if(remover.getDireita() != null){
                remover.setValor(remover.getDireita().getValor());
                remover.setDireita(remover.getDireita().getDireita());
                remover.setEsquerda(remover.getDireita().getEsquerda());
            }else{
                remover.setValor(remover.getEsquerda().getValor());
                remover.setDireita(remover.getEsquerda().getDireita());
                remover.setEsquerda(remover.getEsquerda().getEsquerda());
            }   
        }else{
            Node nodeAux = sucessor(remover.getValor());
            remover.setValor(nodeAux.getValor());
            remove(nodeAux);
        }

        return retorno;
    }
    public Node max(Node node){
        Node retorno;
        if(node.getDireita() != null){
            retorno = max(node.getDireita());
        }else{
            retorno = node;
        }
        return retorno;
    }
    public Node min(Node node){
        Node retorno;
        if(node.getEsquerda() != null){
            retorno = max(node.getEsquerda());
        }else{
            retorno = node;
        }
        return retorno;
    }

    public Node sucessor(int valor){
        Node retorno;
        Node node = search(valor);

        if(node.getDireita() != null){
            retorno = min(node.getDireita());
        }else{
            retorno = node.getAnterior();
            while(retorno != null && node.getValor() > retorno.getValor()){
                retorno = retorno.getAnterior();
            }
        }
        return retorno;

    }
    public Node predecessor(int valor){
        Node retorno;
        Node node = search(valor);

        if(node.getEsquerda() != null){
            retorno = max(node.getEsquerda());
        }else{
            retorno = node.getAnterior();
            while(retorno != null && node.getValor() < retorno.getValor()){
                retorno = retorno.getAnterior();
            }
        }
        return retorno;
    }
    public String bfs(){
        String saida = "";
        if(!isEmpty()){
            Deque<Node> fila = new LinkedList<>();
            fila.addLast(this.root);
            boolean espaco = false;

            while(!fila.isEmpty()){
                if(espaco){
                    saida += " ";
                }
                Node node = fila.removeFirst();
                saida += node.getValor();
                if(node.getEsquerda() != null){
                    fila.addLast(node.getEsquerda());}
                if(node.getDireita() != null){
                    fila.addLast(node.getDireita());}
                espaco = true;
            }
        }
        return saida;
    }

}
class Node{
    private int valor;
    private Node esquerda;
    private Node direita;
    private Node anterior;

    public Node (int valor){
        this.valor = valor;
    }

    public int getValor(){ return this.valor;}

    public Node getDireita(){return this.direita;}
    
    public Node getEsquerda(){return this.esquerda;}

    public Node getAnterior(){return this.anterior;}

    public void setDireita(Node node){this.direita  = node;}

    public void setEsquerda(Node node){this.esquerda = node;}

    public void setAnterior(Node node){this.anterior = node;}

    public boolean ehFolha() {return this.esquerda == null && this.direita == null;}

    public boolean umFilho() {
        return (this.esquerda != null && this.direita == null) || (this.esquerda == null && this.direita != null);
    }
    public String toString(){
        return "Este nó tem o valor de: " + this.valor + ".";
    }
    public boolean FilhoDireita(Node node){
        return node.equals(this.direita);
    }
    public boolean filhoEsquerda(Node node){
        return node.equals(this.esquerda);
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}
*/