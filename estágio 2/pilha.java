/*import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        sc.nextLine();
        pilha estrutura = new pilha(tamanho);
        while(true){
            String entrada = sc.nextLine();
            if(entrada.equals("peek")){
                estrutura.peek();
            }else if(entrada.equals("print")){
                estrutura.print();
            }else if(entrada.equals("pop")){
                estrutura.pop();
            }else if(entrada.equals("end")){
                sc.close();
                break;
            }else{
                estrutura.push(Integer.parseInt(entrada.split(" ")[1]));
            }
        }        
    }
}
class pilha{
    int[] array;
    int capacidade;
    int tail;
    public pilha(int capacidade){
        array = new int[capacidade];
        this.capacidade = capacidade;
        this.tail = -1;
    }
    public boolean isEmpty(){
        return this.tail == -1;
    }
    public boolean isFull(){
        return this.tail + 1 == capacidade;
    }
    public void push(int valor){
        if(isFull()){
            System.out.println("full");
        }else{
            this.tail += 1;
            this.array[this.tail ] = valor;
            
        } 
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            this.tail -=1;
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            String retorno = "";
            boolean espaco = false;
            for(int i = 0; i <= tail; i++){
                if(espaco){
                    retorno += " ";
                }
                retorno += this.array[i];
                espaco = true;
            }
            System.out.println(retorno);
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(this.array[this.tail]);
        }
    }
}*/