/*import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        sc.nextLine();
        fila estrutura = new fila(tamanho);
        while(true){
            String entrada = sc.nextLine();
            if(entrada.equals("element")){
                estrutura.get(0);
            }else if(entrada.equals("print")){
                estrutura.print();
            }else if(entrada.equals("remove")){
                estrutura.remove();
            }else if(entrada.equals("end")){
                sc.close();
                break;
            }else{
                estrutura.add(Integer.parseInt(entrada.split(" ")[1]));
            }
        }        
    }
}
class fila{
    int tail;
    int[] array;
    int capacidade;
    public fila(int tamanho){
        this.array = new int[tamanho];
        this.tail = -1;
        this.capacidade = tamanho;
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            for(int i = 0; i < tail;i++){
                array[i] = array[i + 1]; 
            }
            tail -= 1;
        }
    }
    public boolean isEmpty(){
        return tail == -1;
    }
    public void add(int valor){
        if(isFull()){
            System.out.println("full");
        }else{
            this.tail+= 1;
            this.array[this.tail] = valor;
        }
    }
    public boolean isFull(){
        return this.tail + 1 == this.capacidade;
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
                retorno += array[i];
                espaco = true;
            }
            System.out.println(retorno);
        }
    }
    public void get(int index){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(array[index]);
        }
    }
}*/