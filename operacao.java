import java.util.Scanner; //leitura de dados

public class operacao{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        int resultado;
        char operacao;
        int soma= 0;
        System.out.print("Entre com a operacao a ser realizada (+, - ou *):\n"); 
        operacao = ler.next().charAt(0);
        System.out.print("Entre com o primeiro numero:\n"); 
        n1 = ler.nextInt();
        System.out.print("Entre com o segundo numero:\n"); 
        n2 = ler.nextInt();
        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("O resultado da operacao e: " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("O resultado da operação e: "+ resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("O resultado da operação e: "+ resultado);
                break;
            default:
            System.out.println("Operação invalida");
        }
        
        

        
        
        
        
        
        
    
 }
}