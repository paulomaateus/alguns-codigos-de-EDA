import java.util.Scanner;

class parenteses {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String[] entrada = sc.nextLine().split("");
        System.out.println(verificaValidade(entrada, 0, 0));
    }

    public static String verificaValidade(String[] parenteses, int index, int estado){
        if(estado < 0){
            return "N";
        }
        if(index == parenteses.length && estado == 0) {
            return "S";
        }if(index == parenteses.length && estado != 0){
            return "N";
        }
        if(parenteses[index].equals("(")){
            return verificaValidade(parenteses, index + 1, estado + 1);
        }
        else{
            return verificaValidade(parenteses, index + 1, estado -1);
        }
    }
}
